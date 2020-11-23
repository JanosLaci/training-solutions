package classstructuremethods;

import java.util.Scanner;

public class NoteMain {

    public static void main(String[] args) {

        Scanner scannerForNote = new Scanner(System.in);
        String myName, myTopic, myText;

        System.out.println("Név?");
        myName = scannerForNote.nextLine();

        System.out.println("Téma?");
        myTopic = scannerForNote.nextLine();

        System.out.println("Szöveg?");
        myText = scannerForNote.nextLine();

        Note myNote = new Note();

        myNote.setName(myName);
        myNote.setTopic(myTopic);
        myNote.setText(myText);

        myNote.getNoteText();


    }

}
