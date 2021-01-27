package week13d03;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

//probaOlvasasTextFile.txt tartalma:
//elso sor
//masodik sor
//
//negyedik sor
//otodik sor
//
//hetedik sor
//nyolcadik sor
//kilencedik sor

//Kiírás:
//masodik sor
//
//negyedik sor
//
//hetedik sor
//nyolcadik sor
//null
//null
//null

public class ProbaOlvasasWhileUtan {
    public static void main(String[] args) {



    Path path = Path.of("src/main/resources/week13d03resources/probaOlvasasTextFile.txt");

    BufferedReader bufferedReader;

    {
        try {
            bufferedReader = Files.newBufferedReader(path);
            while (bufferedReader.readLine() !=null) {
                System.out.println(bufferedReader.readLine());
                System.out.println(bufferedReader.readLine());
                System.out.println(bufferedReader.readLine());

            }

        } catch (IOException e) {
            throw new IllegalStateException("Cannot read file.", e);
        }
    }
    }

}



