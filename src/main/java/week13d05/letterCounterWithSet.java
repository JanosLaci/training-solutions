package week13d05;

//Viczián István  9:48 AM
//Junior (adatszerkezetes) feladat:
//Írj egy metódust, amely megszámolja, hogy hány különböző betű van
//egy szóban. A kis és nagybetűk közötti különbség nem számít!
//A space-eket, számjegyeket, stb. ne vegye figyelembe! Csak az
//angol ábécé betűit!

import java.util.HashSet;
import java.util.Set;

public class letterCounterWithSet {

    static int countDistinctEnglishLettersCaseInsensitive(String inputWord){

        //elvárunk legalább egy karaktert
        if (inputWord.length()<1) throw new IllegalArgumentException("Nincs karakter a megadott szóban!");

        //int visszatérés miatt maximalizáljuk a szó hosszát
        if (inputWord.length()>Integer.MAX_VALUE) throw new IllegalArgumentException("Fogd vissza magad!");

        //A kis és nagybetűk közötti különbség nem számít
        String inputWordCaseInsensitive = inputWord.toLowerCase();

        //Ellenőrzés
        //System.out.println(inputWordCaseInsensitive);

        Set<Character> characterSet = new HashSet<>();

        for (int i=0; i<inputWordCaseInsensitive.length(); i++){

            char characterTobecheched = inputWordCaseInsensitive.charAt(i);
            //ellenőrzés
            //System.out.println(inputWordCaseInsensitive.length());
            //System.out.println(characterTobecheched);

            if (Character.isLetter(characterTobecheched)) characterSet.add(characterTobecheched);

        }


        return (int) characterSet.size();

    }

    public static void main(String[] args) {
        int charCount = countDistinctEnglishLettersCaseInsensitive(" w 78,tab   ord");
        System.out.println(charCount);


    }



}
