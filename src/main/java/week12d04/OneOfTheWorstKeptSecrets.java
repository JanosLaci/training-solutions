package week12d04;

//Közös feladatmegoldás után újabb változat készítése

//Viczián István  9:43 AM
//Junior/Mid feladat:
//Töltsd le a példa bináris állomány a
// https://github.com/Training360/strukturavalto-java-public/raw/master/examples/week12d04/src/main/resources/secret.dat
//címről!
//Ez bájtokat tartalmaz, egy szöveg van titkosítva benne.
//Olvasd be bájtonként, és mindegyik bájthoz adjál hozzá tízet!
//Ez valójában egy karakterkód, ezt alakítsd át `char` típusú értékké!
//Majd egymás után írd ki ezeket a konzolra! Ne használj közöttük sortörést!



import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class OneOfTheWorstKeptSecrets {

    public static void main(String[] args) {


        //file letöltés utáni helyi útvonala: src/main/resources/secret.dat
        Path datPath = Path.of("src/main/resources/secret.dat");

        // 1 és 1000 közötti bufferméret bekérése konzolról
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mekkora legyen a buffer mérete? (1-1000 közötti egész szám)");
        int bufferSize = scanner.nextInt();
        if (bufferSize<1 || bufferSize > 1000) {
            throw new IllegalStateException("A megadottbufferméret nem megfelelő");
        }



        try {
            byte[] processedBytesArray = Files.readAllBytes(datPath);

            for (byte byteItem : processedBytesArray) {
                byteItem += 10;
                System.out.print((char) byteItem);

            }

        } catch (IOException e) {
            throw new IllegalStateException("Cannot read the file.", e);
        }

    }

}
