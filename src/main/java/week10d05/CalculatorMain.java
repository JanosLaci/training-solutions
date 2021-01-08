package week10d05;

import java.util.Arrays;

public class CalculatorMain {

    public static void main(String[] args) {

        int[] myArray = new int[]{1, 2, 3, 4, 5, 6, 1, 1, -10};

        System.out.println("A legkisebb, legfeljebb 4 elem összege: " + new Calculator().findMinSum(myArray));

        //proba

        System.out.println("A rendezett tömb:");

        Arrays.sort(myArray);
        for (int item:
             myArray) {
            System.out.println(item);
        }


    }


}


