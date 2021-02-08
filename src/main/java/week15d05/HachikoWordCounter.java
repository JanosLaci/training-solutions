package week15d05;


//Viczián István  9:00 AM
//## Senior
//Ay examples/week14d05/hachiko.srt van a Hachiko film felirata. Csak streamek
//használatával számold ki, hogy hányszor hangzik el a kutya neve a filmben!
//Segítség: a Files.lines() adja vissza a fájl sorait streamben.

//Megj.: A file elérési útja : src/main/resources/week15d05/hachiko.srt
//Konzultáció:https://e-learning.training360.com/courses/take/java-backend-kepzesi-anyagok/
//lessons/20626886-02-05-senior-csoport-junior-java-backend-fejleszto-konzultacio-2021-01-04-29-10-00-11-30-23

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.Stream;

public class HachikoWordCounter {

     public long wordCounterStreamBased(Path path, String wordToCount){

        //alapból így olvas:
        // Files.lines(path, StandardCharsets.UTF_8)
        //Figyelem: ezt csak akkor írja ki információként, ha nincs megadva, alább pl. nem adja ki:
        //Files.lines(path, Charset.forName("windows-1250"));
        long countsBasedOnStream;

        //Csak a Sonarlint szól: használj try-with-resources-t

        try {

            Stream<String> deklaralniKellHogyStringStreamNemCsakStream = Files.lines(path);

            countsBasedOnStream =
                    deklaralniKellHogyStringStreamNemCsakStream
                            .filter(stringLine -> stringLine.contains(wordToCount))
                            .flatMap(wordContainingStringLine -> Arrays.stream(wordContainingStringLine.split(" ")))
                            //Ellenőrzés:
                            //.filter(word -> word.contains(wordToCount))
                            .peek(lineAsAConsumerActionParameter -> System.out.println(lineAsAConsumerActionParameter))
                            .count();


            /*Nem működik a method reference:
            countsBasedOnStream =
                    deklaralniKellHogyStringStreamNemCsakStream
                            .peek(consumerActionParameter -> System.out.println(consumerActionParameter))
                            .filter(String::contains(wordToCount))
                            .count();*/

            /* így működik a contains:
            countsBasedOnStream =
                    Files.lines(path)
                            .peek(consumerActionParameter -> System.out.println(consumerActionParameter))
                            .filter(s -> s.contains(wordToCount))
                            .count();*/


            /*return Files.lines(path).peek(consumerActionParameter -> System.out.println(consumerActionParameter))
                    .filter(s -> s.contains(wordToCount))
                    .count();*/


            /* Kérdés: Miért nem működik a contains résznél az alábbi:
            Stream deklaralniKellHogyStringStreamNemCsakStream = Files.lines(path);

            countsBasedOnStream =
                    deklaralniKellHogyStringStreamNemCsakStream
                            .peek(consumerActionParameter -> System.out.println(consumerActionParameter))
                            .filter(s -> s.contains(wordToCount))
                                    .count();*/


        } catch (IOException ioException) {
            throw new IllegalStateException("Cannot read file.", ioException);
        }
        return countsBasedOnStream;
     }

    public static void main(String[] args) {

        Path path = Path.of("src/main/resources/week15d05/hachiko.srt");
        long myCOunt = new HachikoWordCounter().wordCounterStreamBased(path, "Hachi");
        System.out.println(myCOunt);

    }

}
