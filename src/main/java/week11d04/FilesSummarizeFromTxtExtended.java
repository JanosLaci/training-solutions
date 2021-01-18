/*
package week11d04;

//Viczián István  9:29 AM
//Mai junior/mid level feladat:
//Adott az aktuális könyvtárban több fájl, melynek a nevei: number00.txt, number03.txt, number20.txt, egészen 99-ig.
//Nem minden fájl létezik, lehet, hogy bizonyos számhoz tartozó fájl kimaradt. Olvasd be az állományból a benne lévő
//számot, és ezt összegezd! Használd a Files.isRegularFile() metódust arra, hogy megnézd, létezik-e a fájl!
//Használd a Files.readString() metódust a fájl beolvasására! A FilesSum osztály sumNumbers() metódusába dolgozz!
//(javítás: InputStream nem kell)


import java.util.ArrayList;
import java.util.List;

public class FilesSummarizeFromTxtExtended {

    public static void main(String[] args) {

        //number00.txt, number03.txt, number20.txt, egészen 99-ig : 100 darab létező vagy nem létező file számokkal
        //String lista a file-ok nevének tárolására

        List<String> fileNamesList = new ArrayList<>();
        String fileNameBeginning = "number";
        StringBuilder fileNameToAddToList = new StringBuilder();

        for (int i = 0; i < 100; i++) {


            if (i < 10) fileNameToAddToList.append("0");

            fileNameToAddToList.append(fileNameBeginning);

            fileNameToAddToList.append(Integer.toString(i));

            fileNamesList.add(fileNameToAddToList.toString());

            //ellenőrzés

            System.out.println(fileNamesList.toString());

// //metódus: csak (összegezhető) számot tartalmaz egy adott file
//
//            void checkNumbersInTxtFiles{
//
//
//            }
//
//
//
//
//
//
//            //tömb: létezik-e adott indexnek megfelelő file
//
//            boolean[] filesExistArray = new boolean[100];
//
//            //tömb: adott index esetén mekkora a szám értéke (ha nem létezik, 0 default adható, ha legalább egy file létezik)
//
//            double[] valuesToSummarizeInFilesArray = new double[100];
//
//
//
//
//
//
//
//
//    static isRegularFile()
//
//
//
//            readString()
//
//        }
//
//
//
//
//
//    }


        }

    }
}





*/
