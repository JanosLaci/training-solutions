package exam02;

//Tömbök
//Írj egy olyan metódust az ArraySelector osztályban, mely egy kapott tömbből minden második elemet kiválogat,
// és egy szövegként összerak, szögletes zárójelek között!
//A páros megállapítása index szerint működik.
// Azaz az első, nulla indexű elem páros, a második, azaz egyes indexű elem páratlan, stb.
//Ha nulla elemű a tömb, akkor üres stringet adjon vissza!

public class ArraySelector {


    public String selectEvens( int[] inputArray){
        int lastIndex = 0;

        if (inputArray.length == 0) {return "";};

        StringBuilder textFromEvenItems = new StringBuilder();
        textFromEvenItems.append('[');


        for (int i=0; i<inputArray.length-1; i=i+2) {

            textFromEvenItems.append( Integer.toString(inputArray[i]));
            textFromEvenItems.append(", ");
            lastIndex = i+1;

        }

        textFromEvenItems.append( Integer.toString(inputArray[lastIndex]));
        textFromEvenItems.append(']');
        return textFromEvenItems.toString();

    }


}
