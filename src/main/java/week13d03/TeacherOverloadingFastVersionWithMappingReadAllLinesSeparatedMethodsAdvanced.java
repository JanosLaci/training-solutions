package week13d03;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TeacherOverloadingFastVersionWithMappingReadAllLinesSeparatedMethodsAdvanced {

    static List<String> generateListOfRowsFromFile() {
        Path filePath = Path.of("src/main/resources/week13d03resources/beosztas.txt");
        List<String> allRows;
        try {
            allRows = Files.readAllLines(filePath);
        } catch (IOException e) {
            throw new IllegalStateException("Cannot read the file.");
        }
        return allRows;
    }

    static Map<String, Integer> generateTeacherToSubSubjectCountsMapFromListOfRows(List<String> inputList) {
        Map<String, Integer> teacherToSubjectCounts = new HashMap();

        //első (0 indexű) sor: tanár neve, 4. (3-as indexű) sor az óraszám, majd az 5. (4-es indexű) sor újra a név stb.

        for (int i = 0; i < inputList.size() - 3; i += 4) {
            String teacherRow = inputList.get(i);
            int countOfHours = Integer.parseInt(inputList.get(i + 3));

            teacherToSubjectCounts.merge(teacherRow, countOfHours, Integer::sum);
        }
        return teacherToSubjectCounts;
    }

        static void printTeacherLoadFromMap2 (String inputList2){
            List<String> generatedList = generateListOfRowsFromFile();
            Map generatedTeacherToSubjectCounts = generateTeacherToSubSubjectCountsMapFromListOfRows(generatedList);

            //a feladat szerint "kiírja, hogy hány órája van egy héten"

            if (!generatedTeacherToSubjectCounts.containsKey(inputList2))
                System.out.println("Nincs " + inputList2 + " nevű tanár a fileban.");
            else System.out.println(inputList2 + " óraszáma hetente: " + generatedTeacherToSubjectCounts.get(inputList2));
        }


        public static void main (String[]args){
            printTeacherLoadFromMap2("Bagoly Barbara");
            printTeacherLoadFromMap2("Kovács János");
        }



}