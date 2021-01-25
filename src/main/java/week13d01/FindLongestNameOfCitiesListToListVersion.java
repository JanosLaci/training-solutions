package week13d01;

//Viczián István  8:35 AM
//Mai Junior feladat:
//A GitHubon a
// `examples\week13d01\src\main\resources\iranyitoszamok-varosok-2021.csv`
// fájl tartalmazza a magyar városok listáját.
//Add vissza a leghosszabb nevű várost!

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.SplittableRandom;

public class FindLongestNameOfCitiesListToListVersion {


    static List<String> findLongestFromStringList (List<String> inputStringList){

        List<Integer> lengthList = new ArrayList<>();
        List<String> foundStrings = new ArrayList<>();

        for (String inputStringListItem: inputStringList) {

             lengthList.add(inputStringListItem.length());
        }

        int maxLength = Collections.max(lengthList);

        int numberOfMaxOccurences = Collections.frequency(lengthList, maxLength);

        for (String item:
             inputStringList) {
            if (item.length() == maxLength){
                foundStrings.add(item);
            }
        }

        System.out.println("Az előfordulások száma: " + numberOfMaxOccurences);
        System.out.println(foundStrings);
        return foundStrings;

    }

    static List<String> nameReader(){

        List<String> nameStringList = new ArrayList<>();

                Path filePath = Path.of("src/main/java/week13d01/iranyitoszamok-varosok-2021.csv");
        try {
            List<String> rowStringList = Files.readAllLines(filePath);
            for (String row:
                    rowStringList) {
                String[] rowArray = row.split(";");
                String cityName = rowArray[1];
                nameStringList.add(cityName);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

       return nameStringList;


    }

    public static void main(String[] args) {

        List<String> probaLista = nameReader();
        findLongestFromStringList(probaLista);

    }


}
