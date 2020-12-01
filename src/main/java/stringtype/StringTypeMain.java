package stringtype;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class StringTypeMain {
    public static void main(String[] args) {

        String prefix = "Hello ", name = "John Doe";
        String message = prefix + name;
        message = message + 444;
        boolean b = message.equals("Hello John Doe");
        boolean c = message.equals("Hello John Doe444");



        String concatenatedEmptySrings = "" + "";
        System.out.println("Összefűzött üres Stringek megjelenítése: " + concatenatedEmptySrings);
        System.out.println("Összefűzött üres Stringek hossza: " + concatenatedEmptySrings.length());
        System.out.println("Összefűzött üres Stringek blank: " + concatenatedEmptySrings.isBlank());
        System.out.println("Összefűzött üres Stringek empty: " + concatenatedEmptySrings.isEmpty());

        System.out.println("Az Abcde String hossza\n" +
                "Az első és harmadik karaktere (0-tól indexelünk) vesszővel elválasztva\n" +
                "Az elsőtől a harmadik karakterig tartó részlete:");


        System.out.println("Abcde".length());
        System.out.println("Abcde".charAt(0) + "," + "Abcde".charAt(2));
        System.out.println("Abcde".substring(0,3));


        System.out.println("");
        System.out.println("További kísérletezés:");
        System.out.println("");

        boolean d = message == "Hello John Doe444";
        System.out.println("message referencia == \"Hello John Doe444\" :" + d);


        System.out.println("a message értéke megegyezik-e a \"Hello John Doe\" literál értékével : " + b);
        System.out.println("a message értéke megegyezik-e a \"Hello John Doe444\" értékkel : " + c);


        String concatenated3Spaces = "   " + "   ";
        System.out.println("Összefűzött féltucat space karakter megjelenítése: " + concatenated3Spaces);
        System.out.println("Összefűzött féltucat space karakter hossza: " + concatenated3Spaces.length());
        System.out.println("Összefűzött féltucat space karakter empty: " + concatenated3Spaces.isEmpty());
        System.out.println("Összefűzött féltucat space karakter blank: " + concatenated3Spaces.isBlank());

        String trimmed6Spaces = concatenated3Spaces.trim();
        System.out.println("Trimmelt féltucat space karakter megjelenítése: " + trimmed6Spaces);
        System.out.println("Trimmelt féltucat space karakter hossza: " + trimmed6Spaces.length());
        System.out.println("Trimmelt féltucat space karakter empty: " + trimmed6Spaces.isEmpty());
        System.out.println("Trimmelt féltucat space karakter blank: " + trimmed6Spaces.isBlank());



    }

}
