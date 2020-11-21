package classstructureattributes;

import java.util.Scanner;

public class Music {

    public static void main(String[] args) {
        Song favouriteSong = new Song();

        // testing the proper workings of some specific Hungarian letters

        Scanner zeneszámOlvasó = new Scanner(System.in);

        System.out.println("Előadó?");
        favouriteSong.band = zeneszámOlvasó.nextLine();

        System.out.println("Cím?");
        favouriteSong.title = zeneszámOlvasó.nextLine();


        System.out.println("Hossz?");
        favouriteSong.length = zeneszámOlvasó.nextDouble();

        System.out.println(favouriteSong.band + " - " + favouriteSong.title + " (" + favouriteSong.length + " perc)");
    }
}
