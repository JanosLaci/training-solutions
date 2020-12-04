package attributes.book;

public class BookMain {
    public static void main(String[] args) {

        Book myBook = new Book("A tőke");

        System.out.println(myBook.getTitle());

        myBook.setTitle("A tőke a 21. században");

        System.out.println(myBook.getTitle());


    }

}
