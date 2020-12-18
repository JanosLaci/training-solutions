package week08d05;

import java.util.Scanner;

public class MathAlgorithmsMain {
    public static void main(String[] args) {

        Scanner scannerForMathAlgorithms = new Scanner(System.in);
        System.out.println("Számítsuk ki két pozitív egész szám legnagyobb közös osztóját!");
        System.out.println("Első szám?");
        int myFirstInputInt = scannerForMathAlgorithms.nextInt();
        scannerForMathAlgorithms.nextLine();

        System.out.println("Második szám?");

        int mySecondInputInt = scannerForMathAlgorithms.nextInt();
        MathAlgorithms mathAlgorithms = new MathAlgorithms();

        int myFoundGreatestCommonDivisor = mathAlgorithms.greatestCommonDivisor(myFirstInputInt, mySecondInputInt);

        System.out.println(myFirstInputInt + " " + mySecondInputInt + " legnagyobb közös osztója " + myFoundGreatestCommonDivisor);




    }


}
