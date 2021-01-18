package filesreadstring;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ReadStringFromEmployeesTxt {

    public static void main(String[] args) throws IOException {

        // Jobb egérgomb file-on: Path from Repository Root - vágólap
        // Path fileToRead = Path.of("src/main/java/filesreadstring/employees.txt");

        Path fileToRead = Path.of("src", "main", "java", "filesreadstring", "employees.txt");


        //try catch szerkezeten kívül nem fogadja el a fullContent változót - nem látható
        // előtte kell megadni = null

        String contentFull = null;

        try {
            contentFull = Files.readString(fileToRead);

        } catch (IOException e) {
            e.printStackTrace();
            throw new IllegalStateException("Cannot/Could not read the file.", e);

        }
        System.out.println("Teljes tartalom kiírása (Files.readString()):");

        System.out.println(contentFull);

//readAllLines nem kér kivételkezelést.Miért?

        List<String> contentByLines = Files.readAllLines(fileToRead);

        System.out.println("Lista kiírása (Files.readAllLines()) :");
        System.out.println(contentByLines);

        System.out.println("Lista kiírása elemenként:");
        for (String line:
             contentByLines) {
            System.out.println(line);
        }




    }


}
