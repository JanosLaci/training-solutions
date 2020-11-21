package classstructureio;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner enterInts = new Scanner(System.in);
        System.out.println("Kérem, adjon meg két egész számot!");
        System.out.println("Első szám:");
        int firstNumber = enterInts.nextInt();
        System.out.println("Második szám:");
        int secondNumber = enterInts.nextInt();
        System.out.println(firstNumber + " + " + secondNumber);
        System.out.println(firstNumber + secondNumber);
    }








}
