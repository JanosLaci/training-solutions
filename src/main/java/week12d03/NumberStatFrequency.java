package week12d03;

//Kristóf Bárczay  7:39 AM Mai Junior/Mid-level feladat:
//Készítsd el a week12d03.NumberStat osztályt,
// melyben legyen egy metódus, ami paraméterül vár egy egész számokból álló listát.
// Add vissza azt a számot amelyik pontosan egyszer szerepel a listában.
// Ha több ilyen szám van akkor a kisebbet!
// Ellenőrizd, hogy olyan listát fogadunk el, ami legalább 1 elemű, ha a lista nem ilyen, dobj kivételt!
//pl: {1,1,5,3,4,5,6,5,6,4,1,6,5,4} A megoldás: 3


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class NumberStatFrequency {

    static int returnSmallestSingleIntegerInList (List<Integer> inputList) {

        if (inputList.size()<1) throw new IllegalArgumentException("A listában legalább egy egész számnak lennie kell!");

        // nem fogadja el:  List<Integer> sortedInputList = Collections.sort(inputList);

        // nem fogadja el:  List<Integer> sortedInputList = List.copyOf(inputList);
        //                  Collections.sort(sortedInputList);

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

        int foundInteger = returnSmallestSingleIntegerInList(List.of(1,1,5,3,4,5,6,5,6,4,1,6,5,4) );
        System.out.print(foundInteger);

    }

}
