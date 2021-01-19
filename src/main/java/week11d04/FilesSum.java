package week11d04;

//Viczián István  9:29 AM
//Mai junior/mid level feladat:
//Adott az aktuális könyvtárban több fájl, melynek a nevei: number00.txt, number03.txt, number20.txt, egészen 99-ig.
//Nem minden fájl létezik, lehet, hogy bizonyos számhoz tartozó fájl kimaradt. Olvasd be az állományból a benne lévő
//számot, és ezt összegezd! Használd a Files.isRegularFile() metódust arra, hogy megnézd, létezik-e a fájl!
//Használd a Files.readString() metódust a fájl beolvasására! A FilesSum osztály sumNumbers() metódusába dolgozz!
//(javítás: InputStream nem kell)

//feltevések:
//minden file egy integer számot tartalmaz, és mást nem
//legalább egy file létezik
//minden file a src/main/java/week11d04/numberTxtFiles/ könyvtárban található
// -> Path from Repository Root alapesetben nem Windows-kompatibilis \-jellel adja át az elérési utat a vágólapra.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class FilesSum {

    static int sumNumbers() throws IOException {
        int sumOfIntegers = 0;

        for (int i = 0; i<100; i++){

            //Path "Windows-kompatibilissé" alakítja az elérési utat
            // \ escape karakter nehezen működne

            Path txtFile = Path.of("src", "main", "java", "week11d04", "numberTxTFiles",
                    "number" + ( i<10? "0" + i : i) + ".txt"  );


            if (Files.isRegularFile(txtFile)) {
                int intInFile = Integer.parseInt(Files.readString(txtFile));
                sumOfIntegers += intInFile;
                System.out.println("Az "
                        + txtFile.toString()
                        + " állományban szereplő "
                        + intInFile
                        + " értékű egész szám a számítandó összeghez hozzáadva.");
            }

        }
        return sumOfIntegers;

    }

    public static void main(String[] args) throws IOException {
        int sumOfNumbers = sumNumbers();

        System.out.println(
                "Az src/main/java/week11d04/numberTxtFiles/ könyvtár txt állományaiban található számok összege: "
                + sumOfNumbers);


    }



}
