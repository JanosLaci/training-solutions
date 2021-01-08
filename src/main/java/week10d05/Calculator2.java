package week10d05;

//Adam Arold  9:15 AM
//Mai junior-mid-level feladat:
//Készítsünk egy Calculator nevű osztályt, melynek van egy findMinSum(int[] arr) metódusa.
// A metódus feladata, hogy kiírja a legkisebb összegeket 4 számból, amiket lehetséges összerakni az arr tömb elemeiből.
// Példa: ha az arr tartalma [1, 3, 5, 7, 9], akkor a minimum összeg 1+3+5+7=16. (edited)

import java.util.Arrays;

public class Calculator2 {

    static void findMinSum(int[] arr) {

        if (arr == null) {
            throw new IllegalArgumentException("Nincs tömb megadva.");
        }

        if (arr.length<1) {
            throw new IllegalArgumentException("Üres a tömb.");
        }

        Arrays.sort(arr);

        int arrLength = Math.min(arr.length, 4);
        int toSummarize = 0;

        for (int i=0; i < arrLength; i++){
            toSummarize += arr[i];
        }
        System.out.println(toSummarize);
    }

    public static void main(String[] args) {

        findMinSum(new int[]{1,2,3,-1,-2,-10});

    }
}
