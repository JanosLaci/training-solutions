package week13d03;
//Megj: quick & dirty verzió, Map használatával, readAllLines metódussal

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

public class TeacherOverLoadingFastVersionWithMappingReadAllLines {

    static void printTeacherLoad(String inputName) {

        Path filePath = Path.of("src/main/resources/week13d03resources/beosztas.txt");
        List<String> allRows;
        Map<String, Integer> teacherToSubjectCounts = new HashMap();

        try { allRows = Files.readAllLines(filePath); }
        catch (IOException e) { throw new IllegalStateException("Cannot read the file."); }

        //első (0 indexű) sor: tanár neve, 4. (3-as indexű) sor az óraszám, majd az 5. (4-es indexű) sor újra a név stb.

        for (int i = 0; i < allRows.size() - 3; i += 4) {
            String teacherRow = allRows.get(i);
            int countOfHours = Integer.parseInt(allRows.get(i + 3));

            if (teacherToSubjectCounts.containsKey(teacherRow)) {
                int alreadyCountedHours = teacherToSubjectCounts.get(teacherRow);
                teacherToSubjectCounts.put(allRows.get(i), alreadyCountedHours + countOfHours);
            } else teacherToSubjectCounts.put(allRows.get(i), countOfHours);
        }
        //a feladat szerint "kiírja, hogy hány órája van egy héten"
        if (!teacherToSubjectCounts.containsKey(inputName)) System.out.println("Nincs ilyen nevű tanár a fileban.");
        else System.out.println(inputName + " óraszáma hetente: " + teacherToSubjectCounts.get(inputName));

    }

    public static void main(String[] args) {
        printTeacherLoad("Albatrosz Aladin");
        printTeacherLoad("Antilop Anett");
    }

}