
package week13d03;

//Megj: quick & dirty verzió, Map használatával

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

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class TeacherOverLoadingFastVersionWithMapping {

    static void printTeacherLoad(String inputName){

        Path filePath = Path.of("src/main/resources/week13d03resources/beosztas.txt");
        Map<String,Integer> teacherToSubjectCounts = new HashMap();
        String line;

        try {
            BufferedReader bufferedReader = Files.newBufferedReader(filePath);
            while ((line=bufferedReader.readLine()) != null) {

                String teacherLine = line;
                System.out.println(teacherLine);



                //skip 2 irrelevant rows - skip karaktert skippel!!
                //bufferedReader.skip(2);
                    //kérdés: alábbi két sor nélkül nem fogadja el az int deklarációt. Miért?
                // kérdés: if vizsgálat kell? ha nem, if feltételben is olvas be egyet?
                bufferedReader.readLine();
                bufferedReader.readLine();
                int countOfHours = 0;
                String lastLine;

                if ((lastLine = bufferedReader.readLine()) != null) countOfHours = Integer.parseInt(lastLine);


                //fill up the Map

                if (teacherToSubjectCounts.containsKey(teacherLine)) {
                    countOfHours += teacherToSubjectCounts.get(teacherLine);
                    teacherToSubjectCounts.put(teacherLine, countOfHours);
                }
                else teacherToSubjectCounts.put(teacherLine, countOfHours);
            }
        } catch (IOException e) { throw new IllegalStateException("Cannot read the file.", e); }

        //a feladat szerint "kiírja, hogy hány órája van egy héten"
        if (!teacherToSubjectCounts.containsKey(inputName)) System.out.println("Nincs ilyen nevű tanár a fileban.");
        else System.out.println(inputName + " óraszáma hetente: " + teacherToSubjectCounts.get(inputName));


    }

    public static void main(String[] args) {

        printTeacherLoad("Albatrosz Aladin");
        printTeacherLoad("Antilop Anett");

    }




}

