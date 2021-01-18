/*
package week11d04;

//Viczián István  9:29 AM
//Mai junior/mid level feladat:
//Adott az aktuális könyvtárban több fájl, melynek a nevei: number00.txt, number03.txt, number20.txt, egészen 99-ig.
//Nem minden fájl létezik, lehet, hogy bizonyos számhoz tartozó fájl kimaradt. Olvasd be az állományból a benne lévő
//számot, és ezt összegezd! Használd a Files.isRegularFile() metódust arra, hogy megnézd, létezik-e a fájl!
//Használd a Files.readString() metódust a fájl beolvasására! A FilesSum osztály sumNumbers() metódusába dolgozz!
//(javítás: InputStream nem kell)


import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class FilesSum {

    public static void main(String[] args) {
        String fileNameBeginning = "number";


        //lista a fileok nevéhez

        List<String> fileNamesList = new ArrayList<>();

        for (int i=0; i<100; i++) {

            StringBuilder fileNameToAddToList = new StringBuilder();
            fileNameToAddToList.append(fileNameBeginning);

            if (i<10) fileNameToAddToList.append("0");

            fileNameToAddToList.append(Integer.toString(i));


            fileNamesList.add(fileNameToAddToList.toString());

        }


    }


    sumNumbers(InputStream)






}
*/
