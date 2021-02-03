package week14d03;

//Kristóf Bárczay  7:36 AM
//Mai junior/mid-level feladat
//Készíts egy diák (`Student`) osztályt melyben egy diák jegyeit tárolod egy Map-ben.
// A map kulcsa a tantárgy, értéke pedig az adott tantárgy jegyeinek listája.
// Ezen felül a diáknak legyen neve, melyet konstruktorban kap meg. Legyen benne egy metódus,
// ami paraméterül vár egy tantárgyat és egy jegyet, és beírja a jegyet a megfelelő tantárgyhoz.
// Készítsd el a `ClassNotebook` nevű osztályt melyben diákok listája található.
// Készíts egy lekérdező metódust a `ClassNoteBook` osztályban,
// legyen a neve `sortNotebook` mely a diákok listáját ABC sorrendben adja vissza.

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class Student {
    private String név;
    Map<Subject, List<Rating>> érdemjegyek;


//Amikor érdemjegyet adunk, annak be kell kerülnie a studentList -ába is
    //kérdés: a studentList emiatt csak statikus lehet?
    //kérdés: bővíthető a lista tanulókkal is? vagy csak már meglévő tanulónak adható jegy?

    void giveRating(Subject inputSubject, Rating inputRating ){

        // A lista példányosítása és az elem hozzáadása elkülöníthető, és érdemes is elkülöníteni,
        // hiszen az érdemjegyet mindenképpen hozzá kell adni
        if (!érdemjegyek.containsKey(inputSubject)) érdemjegyek.put(inputSubject, new ArrayList<>());

        érdemjegyek.get(inputSubject).add(inputRating);

        System.out.println("A " + this.getNév() + " tanuló \n" + inputSubject.toString().toLowerCase()
                + "\ntantárgyához a következő érdemjegy került beírásra: \n" + inputRating.toString().toLowerCase() + ".");


    }

    //Példányosíthatunk Student objektumot névvel ill. névvel és érdemjegyekkel is,
    //a ClassNoteBook studentList-ájához is hozzáadjuk?

    Student(String név) {
        this.név = név;
        ClassNoteBook.studentList.add(this);
    }

    Student(String név, Map<Subject, List<Rating>> érdemjegyek) {
        this.név = név;
        this.érdemjegyek = érdemjegyek;
        ClassNoteBook.studentList.add(this);

    }

    String getNév() {
        return név;
    }

    Map<Subject, List<Rating>> getÉrdemjegyek() {
        return érdemjegyek;
    }
}


