package week15day05.GameOfThrones;

//Melyik ház vett részt a legtöbb csatában?


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class hazSzamlalo {

    public List<String> readLines(BufferedReader reader) throws IOException {

        String[] sorStringTomb;
        List<String> beolvasottHazakListaja = new ArrayList<>();

        String line;


        while ((line = reader.readLine())  != null) {
            sorStringTomb = line.split(",");

            //for (int i = 5; i <= 12; i++) {
            //beolvasottHazakListaja.add(sorStringTomb[i]);

            beolvasottHazakListaja.addAll(Arrays.asList(sorStringTomb).subList(5, 13));
        }

        return beolvasottHazakListaja;

    }

    public static void main(String[] args) {
        try (BufferedReader reader = Files.newBufferedReader(
                Path.of("src/main/resources/week15d05/GameOfThrones/battles.csv"))) {
            new hazSzamlalo().readLines(reader);


        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file", ioe);
        }
    }


}
