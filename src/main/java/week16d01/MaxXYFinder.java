/*
package week16d01;


//Kristóf Bárczay  11:42 AM
//Mai Junior feladat!
//Adott egy függvénygrafikon a koordináta rendszerben. A grafikon néhány pontját megkapjuk egy Map-ben.
// A map kulcsa az x koordináta, értéke pedig az y koordináta.
// Döntsük el, hogy a kapott pontok küzül, hol van a függvénynek maximum helye és ott mennyi az értéke. (edited)

import java.util.*;

public class MaxXYFinder {

 List<Double> findMaxXandY(Map<Double, Double> inputMapOfXY){
     List<Double> oneSolutionXYList = new ArrayList<>();

     Collection<Double> doubleValues = inputMapOfXY.values();

     double maxValue = Collections.max(doubleValues);
     List<Double> foundMaxlocations = new ArrayList<>();
     double foundMaxLocation= 0;
     int numberOfMaxLocations = 0;

     for (Double key: inputMapOfXY.keySet()) {
         boolean foundAtLeastOneMaxLocation = false;
         if (inputMapOfXY.get(key) == maxValue) {
             foundMaxLocation = key;
             foundAtLeastOneMaxLocation = true;
             foundMaxlocations.add(key);
             numberOfMaxLocations +=1;
         }
     }

     if (foundAtLeastOneMaxLocation = false) throw new IllegalArgumentException("Nem található maximum!");


     oneSolutionXYList.add(foundMaxLocation);
     oneSolutionXYList.add(maxValue);
     System.out.println();



     //Tévút:
     // double maxValue = Collections.sort(inputMapOfXY.values());

     */
/*inputMapOfXY.values();

     List<Double> maxXYList = new ArrayList<>();*//*

     return oneSolutionXYList;
 }



}
*/
