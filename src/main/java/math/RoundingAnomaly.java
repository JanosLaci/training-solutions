package math;

//Generálj ezer lebegőpontos véletlenszámot öt tizedesjegyig egy tömbbe, értékük legyen maximum egymillió.
// Add össze őket, majd kerekítsd a matematika szabályai szerint, valamint kerekítsd le egyesével őket, és add össze a kerekített értékeket.
// Hasonlítsd össze a két eredményt. Futtasd le ciklusban 100-szor, és vedd a kerekítési különbségek átlagát.
//A math.RoundingAnomaly osztályba dolgozz.
//Külön metódusba szervezd:
//Számok generálását egy tömbbe: double[] randomNumbers(int size, double max, int scale)
//Összeadást majd kerekítést double roundAfterSum(double[] numbers)
//Kerekítést, majd összeadást: double sumAfterRound(double[] numbers)
//Különbség számolást: double difference(int size, double max, int scale).
// Ezt a metódust kell a main metódusból 100-szor meghívni, és a visszaadott értékeket átlagolni.
// Ez a metódus hívja az előző hármat úgy, hogy először legenerál egy tömböt, majd ugyanazzal a tömbbel hívd meg a roundAfterSum, majd a sumAfterRound metódusokat. Majd a két metódus által visszaadott érték különbségével kell visszatérni.
//A ciklusban futtatást (100-szor) implementáld a main() metódusban.

import java.util.Random;

public class RoundingAnomaly {

    public double[] randomNumbers(int size, double max, int scale){
        double[] generatedArray = new double[size];
        Random randomDouble = new Random(33);

        for (int i = 0; i < size; i++ ) {generatedArray[i] = randomDouble.nextDouble();}

        return generatedArray;
    }

    public double roundAfterSum(double[] numbers){
        double summedNumbers = 0.0 ;
        for (double number:numbers
             ) {
            summedNumbers = summedNumbers + number;
        }
        double roundedSummedNumbers = Math.round(summedNumbers*100000.0)/100000.0;
        return roundedSummedNumbers;
    }

    public double sumAfterRound(double[] numbers){
        for (int i = 0; i < numbers.length; i++ ) {numbers[i] = Math.round(numbers[i]*100000.0)/100000.0;}
        double summedNumbers = 0.0 ;
        for (double number:numbers
        ) {
            summedNumbers = summedNumbers + number;
        }
        return summedNumbers;
    }

    public double difference(int size, double max, int scale){
        return 0.0;


    }



    public static void main(String[] args) {

    }
}
