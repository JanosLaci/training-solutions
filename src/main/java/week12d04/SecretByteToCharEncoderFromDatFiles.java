package week12d04;


//Viczián István  9:43 AM
//Junior/Mid feladat:
//Töltsd le a példa bináris állomány a
// https://github.com/Training360/strukturavalto-java-public/raw/master/examples/week12d04/src/main/resources/secret.dat
//címről!
//Ez bájtokat tartalmaz, egy szöveg van titkosítva benne.
//Olvasd be bájtonként, és mindegyik bájthoz adjál hozzá tízet!
//Ez valójában egy karakterkód, ezt alakítsd át `char` típusú értékké!
//Majd egymás után írd ki ezeket a konzolra! Ne használj közöttük sortörést!

//file letöltés utáni helyi útvonala: src/main/resources/secret.dat


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SecretByteToCharEncoderFromDatFiles {
    public static void main(String[] args) {


        Path datPath = Path.of("src/main/resources/secret.dat");

        try {
            byte[] processedBytesArray = Files.readAllBytes(datPath);

            for (byte byteItem: processedBytesArray) {
                byteItem += 10;
                System.out.print((char) byteItem);

            }


            } catch (IOException e) {
                throw new IllegalStateException("Cannot read the file.", e);
            }

    }
}
