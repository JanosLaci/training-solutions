package week14d03;


//Kérdés: Mikor importál *-gal automatikusan? Mitől függ?

import java.text.Collator;
import java.util.*;

public class ClassNoteBook {

    public static List<Student> studentList = List.of(new Student("Pistike", Map.of(Subject.IDEGEN_NYELV, List.of(Rating.JÓ, Rating.JELES))),
            new Student("Áronka", Map.of(Subject.TECHNIKA_ÉLETVITEL_ÉS_GYAKORLAT, List.of(Rating.KÖZEPES, Rating.JELES))),
                    new Student("Arabella", Map.of(Subject.MATEMATIKA, List.of(Rating.JELES, Rating.JELES))),
            new Student("Ödönke")
            );

    public ClassNoteBook() {

    }

    //lekérdező metódust a `ClassNoteBook` osztályban,
    //// legyen a neve `sortNotebook` mely a diákok listáját ABC sorrendben adja vissza


    static List<Student> sortNotebookEnglishAlphabet() {
        //hogyan lehet elkerülni, hogy az eredeti listát is rendezze?
        List<Student> toBeSortedListOfStudents = List.copyOf(studentList);

        //csak az újonnan példányosított másolat-listát rendezi?
        //"visszatérése" void

        //A magyar ábc-hez nem lesz elég a Comparator
        Collections.sort(toBeSortedListOfStudents, Comparator.comparing(Student::getNév));
        return toBeSortedListOfStudents;

    }

    static List<Student> sortNotebookDefaultAlphabet() {
        //hogyan lehet elkerülni, hogy az eredeti listát is rendezze?
        List<Student> toBeSortedListOfStudents = List.copyOf(studentList);

        //csak az újonnan példányosított másolat-listát rendezi?
        //"visszatérése" void

        //A magyar ábc-hez nem lesz elég a Comparator
        Collections.sort(toBeSortedListOfStudents, Collator.getInstance(Locale.getDefault()));
        return toBeSortedListOfStudents;

    }

     static List<Student> sortNotebookHungarianAlphabet() {
        //hogyan lehet elkerülni, hogy az eredeti listát is rendezze?
        List<Student> toBeSortedListOfStudents = List.copyOf(studentList);

        //csak az újonnan példányosított másolat-listát rendezi?
        //"visszatérése" void

        //A magyar ábc-hez nem lesz elég a Comparator
        Collections.sort(toBeSortedListOfStudents, Collator.getInstance(Locale.forLanguageTag("HU")));
        return toBeSortedListOfStudents;

    }


    public ClassNoteBook(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }
}
