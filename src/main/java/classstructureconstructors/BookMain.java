package classstructureconstructors;

import java.util.Scanner;

public class BookMain {


    public static void main(String[] args) {

        Scanner scannerForBook = new Scanner(System.in);
        String myAuthor, myTitle, myRegnumber;

        System.out.println("Szerző?");
        myAuthor = scannerForBook.nextLine();

        System.out.println("Cím?");
        myTitle = scannerForBook.nextLine();

        Book myBook = new Book(myAuthor, myTitle);

        System.out.println("Az új könyv szerzője: " + myAuthor + ", címe: " + myTitle + ".");
        System.out.println("Mi legyen a regisztrációs száma?");

        myRegnumber = scannerForBook.nextLine();

        myBook.register(myRegnumber);

        System.out.println("A " + myAuthor + ": " + myTitle + " című könyv regisztrációs száma " + myRegnumber + " lett." );





    }

}
