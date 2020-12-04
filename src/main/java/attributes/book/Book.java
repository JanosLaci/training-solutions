package attributes.book;

//Hozz létre egy attributes.book.Book osztályt, és legyen egy String title attribútuma!
// Hozz létre egy konstruktort, mely egy paraméteres és értéket ad a title attribútumnak!
// Hozz létre egy setTitle() metódust, mely értéket ad a title attribútumnak!
// Hozz létre egy getTitle() metódust, mely lekéri az értékét!
//Teszteld a BookMain main() metódusában.

public class Book {
    String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
