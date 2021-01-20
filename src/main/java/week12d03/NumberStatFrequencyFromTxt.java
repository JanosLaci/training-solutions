package week12d03;


//Kristóf Bárczay  7:39 AM
//Mai Junior/Mid-level feladat:
//Készítsd el a week12d03.NumberStat osztályt,
// melyben legyen egy metódus, ami paraméterül vár egy egész számokból álló listát.
// Add vissza azt a számot amelyik pontosan egyszer szerepel a listában.
// Ha több ilyen szám van akkor a kisebbet!
// Ellenőrizd, hogy olyan listát fogadunk el, ami legalább 1 elemű, ha a lista nem ilyen, dobj kivételt!
//pl: {1,1,5,3,4,5,6,5,6,4,1,6,5,4} A megoldás: 3
//Bónusz: Módosítsd az osztályt. Legyen egy egész számokból álló lista attribútuma.
// A fent megírt metódus ezen a listán dolgozzon.
// A lista elemeit fájlból töltsük fel.
// A file úgy néz ki, hogy egy sorban három szám van vesszővel elválasztva. Tehát:
//1,1,4
//2,3,5
//2,2,5 (edited)

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumberStatFrequencyFromTxt {

    static List<Integer> returnIntegerListFromTxt(String txtFileName) throws IOException {

        //file helye: src/main/java/week12d03/TxtContainer3IntsPerRowSepByComma/InputTxt3IntsPerRowSepByComma.txt

        Path inputFilePath = Path.of("src", "main", "java", "week12d03", "TxtContainer3IntsPerRowSepByComma",
                txtFileName);

        List<String> linesListFromTxt = Files.readAllLines(inputFilePath);
        //ellenőrzés:
        //System.out.println(linesListFromTxt);
        List<Integer> constructedIntegerList = new ArrayList<>();

        for (String lineString:
             linesListFromTxt) {
            String[] lineArray = lineString.split(",");

            //ellenőrzés:
            //System.out.println(Arrays.toString(lineArray));

            for (String arrayItem:
                 lineArray) {
                constructedIntegerList.add(Integer.parseInt(arrayItem));
            }
            //ellenőrzés: System.out.println(constructedIntegerList);
        }

        return constructedIntegerList;

    }

    static int returnSmallestSingleIntegerInListForBonusTask (List<Integer> inputList) {

        if (inputList.size()<1) throw new IllegalArgumentException("A listában legalább egy egész számnak lennie kell!");

        // nem fogadja el:  List<Integer> sortedInputList = Collections.sort(inputList);

        // nem fogadja el:  List<Integer> sortedInputList = List.copyOf(inputList);
        //                  Collections.sort(sortedInputList);

        // 2,3,5,, - elfogadja
        //2,3,,5, nem fogadja el
        //,2,3,5, nem fogadja el

        List<Integer> sortedInputList = new ArrayList<>(List.copyOf(inputList));
        Collections.sort(sortedInputList);


        for (int integerItemToBeChecked:
                sortedInputList) {
            if (Collections.frequency(sortedInputList, integerItemToBeChecked) == 1){
                return integerItemToBeChecked;
            }
        }

        throw new IllegalStateException("Nincs egyedi egész szám a listában!");

    }



    public static void main(String[] args) {
        List<Integer> returnedList = new ArrayList<>();

        try {
             returnedList = returnIntegerListFromTxt("InputTxt3IntsPerRowSepByComma.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        int foundIntFromTxt = returnSmallestSingleIntegerInListForBonusTask(returnedList);
        System.out.println(foundIntFromTxt);

    }




}
