/*
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

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class NumberStat {

    static int returnSmallestSingleIntegerInList (List<Integer> inputList) {

        if (inputList.size()<1) throw new IllegalArgumentException("A listában legalább egy egész számnak lennie kell!");



        if (inputList.size()==1) return inputList.get(0);

        //Ezután tudjuk, hogy az inputList legalább két elemű

        if ( inputList.size()==2 && inputList.get(0) != inputList.get(1)) return Math.max(inputList.get(0), inputList.get(1));

        // nem fogadja el: List<Integer> sortedInputList = Collections.sort(inputList);

        List<Integer> sortedInputList = List.copyOf(inputList);
        Collections.sort(sortedInputList);

        int foundSmallestSingleInteger = 0;

        int indexOfLastItemToBeChecked = sortedInputList.size()-1-1;

        for (int i = 0; i<;
             sortedInputList) {
            int nextItemInList = sortedInputList.get()

        }


    }



}
*/
