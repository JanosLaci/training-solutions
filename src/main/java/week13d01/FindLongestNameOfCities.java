/*
package week13d01;

//Viczián István  8:35 AM
//Mai Junior feladat:
//A GitHubon a
// `examples\week13d01\src\main\resources\iranyitoszamok-varosok-2021.csv`
// fájl tartalmazza a magyar városok listáját.
//Add vissza a leghosszabb nevű várost!

import java.io.Serial;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindLongestNameOfCities {

    static List<String> findLongestFromStringList (List<String> inputStringList){
        int sizeOfList = inputStringList.size();
        int[] stringLengths = new int[sizeOfList];
        int arrayIndex = 0;

        for (String inputStringListItem:
             inputStringList) {

             stringLengths[arrayIndex]=inputStringListItem.length();
             arrayIndex++;
        }

        int maxLength = (int) Collections.max(Arrays.asList(stringLengths));


    }


}
*/
