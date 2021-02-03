package week14d03;

import java.util.List;
import java.util.Map;

public class ClassNoteBookMain {
    public static void main(String[] args) {

        /*Student pistike = new Student("Pistike", Map.of(Subject.IDEGEN_NYELV, List.of(Rating.JÓ, Rating.JELES)) );
        Student áronka = new Student("Áronka", Map.of(Subject.TECHNIKA_ÉLETVITEL_ÉS_GYAKORLAT, List.of(Rating.KÖZEPES, Rating.JELES)) );
        Student arabella = new Student("Arabella", Map.of(Subject.MATEMATIKA, List.of(Rating.JELES, Rating.JELES)) );*/
        ClassNoteBook classNoteBook = new ClassNoteBook();

        Student ujTanulo = new Student("Írisz", Map.of(Subject.MATEMATIKA, List.of(Rating.JELES, Rating.JELES)) );
        ujTanulo.giveRating(Subject.KÖRNYEZETISMERET, Rating.KÖZEPES);

        List magyarSorrendbenRendezettNapló = classNoteBook.sortNotebookHungarianAlphabet();
        System.out.println(magyarSorrendbenRendezettNapló);

    }

}
