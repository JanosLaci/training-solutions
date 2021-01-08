package week10d05;


//Adam Arold  9:15 AM
//Mai junior-mid-level feladat:
//Készítsünk egy Calculator nevű osztályt, melynek van egy findMinSum(int[] arr) metódusa.
// A metódus feladata, hogy kiírja a legkisebb összegeket 4 számból, amiket lehetséges összerakni az arr tömb elemeiből.
// Példa: ha az arr tartalma [1, 3, 5, 7, 9], akkor a minimum összeg 1+3+5+7=16. (edited)

import java.util.Arrays;

public class Calculator {

     int findMinSum(int[] arr){

//Létezik 0 elemű tömb?

            if (arr.length<1) {
            System.out.println("A megadott tömbben nincsenek elemek!");
            return -1;
        }

        Arrays.sort(arr);

        int toSumArrayLength = Math.min(arr.length, 4);
        int summarizedMin = 0;

        for (int i=0; i < toSumArrayLength; i++){
            summarizedMin = summarizedMin + arr[i];
        }

        return summarizedMin;
    }
}
