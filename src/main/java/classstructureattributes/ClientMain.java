package classstructureattributes;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {

// testing the proper workings of some specific Hungarian letters
        Client ügyfél = new Client();

        Scanner ügyfélOlvasó = new Scanner(System.in);

        System.out.println("Ügyfélnév?");
        ügyfél.name = ügyfélOlvasó.nextLine();

        System.out.println("Ügyfél születési éve?");
        ügyfél.yb = ügyfélOlvasó.nextInt();

        //After entering the age int number, Enter throws off next line

        String enterKezelése = ügyfélOlvasó.nextLine();

        System.out.println("Ügyfélcím?");
        ügyfél.address = ügyfélOlvasó.nextLine();

        System.out.println("Ügyfélnév: " + ügyfél.name +  ", Ügyfél születési éve: " + ügyfél.yb + ", Ügyfélcím: " + ügyfél.address + ".");





    }


}


