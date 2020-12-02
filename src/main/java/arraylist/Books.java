package arraylist;

//Készíts egy Books osztályt, melyben egy ArrayList<String> tárolja a könyvek címeit.
// Írj egy add(String) metódust, mely felveszi a könyvet.
// Legyen egy List<String> findAllByPrefix(String prefix) metódusa,
// mely az összes olyan könyvet visszaadja, mely címének eleje megegyezik a paraméterként átadott szöveggel.
// Legyen egy List<String> getTitles() metódus, mely visszaadja a könyvek címeit.
//Írj egy main() metódust, mely teszteli a metódusok működését.


import classstructureconstructors.Book;

import java.util.ArrayList;
import java.util.List;

public class Books {

    List<String> bookTitles = new ArrayList<>();

    public void add(String bookTitle){
        bookTitles.add(bookTitle);
    }

    public List<String> findAllByPrefix(String prefix){
        int prefixLength = prefix.length();
        List<String> matchedBookTitles = new ArrayList<>();

        for (String title : bookTitles) {
            if ( prefix.equalsIgnoreCase(title.substring(0,prefixLength)) ) {
                matchedBookTitles.add(title);


            }


        }
        return matchedBookTitles;
    }


    public List<String> getTitles(){
        return bookTitles;

    }

    public static void main(String[] args) {
        Books myBooks = new Books();

        myBooks.add("Első");
        myBooks.add("Második");
        myBooks.add("Harmadik");
        myBooks.add("Negyedik");
        myBooks.add("Ötödik");
        myBooks.add("Hatodik");


        List myTitles = myBooks.getTitles();
        System.out.println(myTitles);

        List foundTitles = myBooks.findAllByPrefix("ha");
        System.out.println(foundTitles);


    }



}



