package week13d03;

//Megj: quick & dirty verzió, Map használatával, readAllLines metódussal, metódusok kiszervezésével

//Kristóf Bárczay  7:42 AM
//Mai Junior/Mid-level feladat (`week13d03resources`):
//Adott a következő szerkezetű fájl, beosztas.txt:
//Albatrosz Aladin
//biologia
//9.a
//2
//Albatrosz Aladin
//osztalyfonoki
//9.a
//1
//Csincsilla Csilla
//matematika
//9.b
//2
//A fájl tantárgyfelosztást tartalmaz.
// A tantárgyfelosztást 4-es blokkokban adjuk meg.
// Első sor a tanár neve, majd a tantárgy, majd az osztály ahol tanítja és végül az, hogy heti hány órában.
// Írj egy metódust, ami paraméterül várja egy tanár nevét, és kiírja, hogy hány órája van egy héten. (edited)


//Megj.: A beosztas.txt URL-je: https://files.slack.com/files-pri/T01BZA8QS59-F01LPPNT4JU/beosztas.txt
//                      helyi elérési útvonala: src/main/resources/week13d03resources/beosztas.txt
//Feltételezés: nincs ugyanolyan nevű két tanár, tehát a tanár neve egyedi azonosító



import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TeacherOverloadingFastVersionWithMappingReadAllLinesSeparatedMethods {

    static List<String> generateListOfRowsFromFile(){
        Path filePath = Path.of("src/main/resources/week13d03resources/beosztas.txt");
        List<String> allRows;
        try { allRows = Files.readAllLines(filePath); }
        catch (IOException e) { throw new IllegalStateException("Cannot read the file."); }
        return allRows;
    }

    static Map<String, Integer> generateTeacherToSubSubjectCountsMapFromListOfRows (List<String> inputList){
        Map<String, Integer> teacherToSubjectCounts = new HashMap();

        //első (0 indexű) sor: tanár neve, 4. (3-as indexű) sor az óraszám, majd az 5. (4-es indexű) sor újra a név stb.

        for (int i = 0; i < inputList.size() - 3; i += 4) {
            String teacherRow = inputList.get(i);
            int countOfHours = Integer.parseInt(inputList.get(i + 3));

            if (teacherToSubjectCounts.containsKey(teacherRow)) {
                int alreadyCountedHours = teacherToSubjectCounts.get(teacherRow);
                teacherToSubjectCounts.put(inputList.get(i), alreadyCountedHours + countOfHours);
            } else teacherToSubjectCounts.put(inputList.get(i), countOfHours);
        }
        return teacherToSubjectCounts;
    }

    static void printTeacherLoadFromMap(String inputName) {
        List<String> generatedList = generateListOfRowsFromFile();
        Map generatedTeacherToSubjectCounts = generateTeacherToSubSubjectCountsMapFromListOfRows(generatedList);

        //a feladat szerint "kiírja, hogy hány órája van egy héten"

        if (!generatedTeacherToSubjectCounts.containsKey(inputName)) System.out.println("Nincs " + inputName + " nevű tanár a fileban.");
        else System.out.println(inputName + " óraszáma hetente: " + generatedTeacherToSubjectCounts.get(inputName));
    }


    public static void main(String[] args) {
        printTeacherLoadFromMap("Bagoly Barbara");
        printTeacherLoadFromMap("Kovács János");
    }



}
