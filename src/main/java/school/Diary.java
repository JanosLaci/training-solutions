package school;


//Napló
//Ebben a feladatban egy iskolai naplózó rendszert kell megvalósítanod.
//Készíts a school csomagban egy Diary nevű osztályt benne egy newMark() metódussal,
// ami paraméterül várja a tanuló nevét és egy jegyet!
// Ha létezik a "tanulo_neve.txt" akkor a jegyet hozzáfűzi az állomány végére.
// Ha nem, akkor egy új állományt hoz létre "tanulo_neve.txt" formátumban, és beleírja a jegyet.
// Azt, hogy létezik-e egy fájl a Files.exists(path) metódussal tudod eldönteni.
// A fájlok a src/main/resources/ könyvtárban legyenek!
//Az év végén a tanár szeretné a tanuló fájl utolsó sorába az átlagot beírni.
// Írj egy metódust average() névvel, ami a fájl utolsó sorába a jegyek átlagát írja be! Például "average: 5".

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Diary {

 static void newMark(String tanuloNeve, int tanuloErdemjegye){
     String tanuloFileNev = tanuloNeve +".txt";
     Path eleresiPath= Path.of("src", "main", "resources", tanuloFileNev);

     boolean letezikMarAFile = Files.exists(eleresiPath);

     if (letezikMarAFile) {
         try {
             Files.writeString( eleresiPath, Integer.toString(tanuloErdemjegye) + "\n", StandardOpenOption.APPEND);
         } catch (IOException e) {
             e.printStackTrace();
         }
     }
     else   {
         try {
             Files.writeString( eleresiPath, Integer.toString(tanuloErdemjegye) + "\n");

         } catch (IOException e) {
             e.printStackTrace();
         }
     }
 }

 static void average(String tanuloNeve){
     String tanuloFileNev = tanuloNeve +".txt";
     Path eleresiPath= Path.of("src", "main", "resources", tanuloFileNev);

     boolean letezikMarAFile = Files.exists(eleresiPath);
     List<String> erdemjegyLista = new ArrayList();

     if (letezikMarAFile){
         try {
             erdemjegyLista = Files.readAllLines(eleresiPath);
         } catch (IOException e) {
             e.printStackTrace();
         }
         int erdemjegyekSzama = erdemjegyLista.size();
         int erdemjegyekOsszege = 0;
         double atlagErdemjegy;
         for (String erdemjegyString:
              erdemjegyLista) {
             erdemjegyekOsszege += Integer.parseInt(erdemjegyString);
         }
         atlagErdemjegy = ( (double) erdemjegyekOsszege / (double) erdemjegyekSzama );

         try {
             Files.writeString(eleresiPath, "A tanuló átlaga " + atlagErdemjegy, StandardOpenOption.APPEND);
         } catch (IOException e) {
             e.printStackTrace();
         }

         System.out.println("A tanuló átlaga (" + atlagErdemjegy + ") beírásra került a file végére.");
         System.out.println(erdemjegyekOsszege);
         System.out.println(erdemjegyekSzama);


     }

     else System.out.println("A megadott tanulóhoz nem tartozik napló.");



 }


    public static void main(String[] args) {
     newMark("tanulo_neve",3);
     newMark("Kovács Pisti",4);
     newMark("tanulo_neve",4);
     newMark("Kovács Pisti",5);

     average("tanulo_neve");



    }

}
