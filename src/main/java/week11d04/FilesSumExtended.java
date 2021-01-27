/*
package week11d04;

import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FilesSumExtended {


    public static void main(String[] args) {

        //number00.txt, number03.txt, number20.txt, egészen 99-ig : 100 darab létező vagy nem létező file számokkal
        //String lista a lehetséges file-ok nevének tárolására

        List<String> fileNamesList = new ArrayList<>();


        for (int i = 0; i < 100; i++) {

            String fileNameBeginning = "number";

            //0 és 9 között 0 hozzáadása:
            if (i < 10) fileNameBeginning += "0";

            fileNamesList.add(fileNameBeginning + i + ".txt");

        }
        //ellenőrzés
        // System.out.println(fileNamesList.toString());

        //tömb: létezik-e adott indexnek megfelelő file

        boolean[] fileExistsArray = new boolean[100];

        for (int i = 0; i < 100; i++) {
            fileExistsArray[i] = Files.isRegularFile(Path.of(fileNamesList.get(i).toString()));
            //fileExistsArray[i] = Files.isRegularFile(FileSystems.getDefault().getPath("week11d04", fileNamesList.get(i).toString()));


        }
        for (boolean doesItExist:
        fileExistsArray) {
            System.out.println(doesItExist);
        }




    }



}
*/
