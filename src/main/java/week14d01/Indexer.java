package week14d01;

//Adam Arold  9:25 AM
//Mai junior/medior feladat:
//Készíts egy Indexer osztályt, melynek van egy
// public Map<Character, List<String>> index(List<String> names)
// metódusa.
//A feladat az, hogy egy indexet készítsünk a megadott nevek kezdőbetűiből
// (minden kezdőbetűt társítsunk az összes névvel, mely ezzel a betűvel kezdődik).
//Példa:
//System.out.println(new Indexer().index(Arrays.asList("Odon", "Lujza", "Abraham", "Magdolna")));
// {A=[Abraham], L=[Lujza], M=[Magdolna], O=[Odon]}

//Megj.: Feltételezzük, hogy a megadott nevek kezdőbetűi helyett a kezdő kataktereket használhatjuk,
// tehát pl. Csilla esetében a kezdőbetű (kezdőkarakter) C, és nem Cs.

import java.util.*;

public class Indexer {

    public Map<Character, List<String>> index(List<String> names) {

        if (names.size()<1) throw new IllegalArgumentException("Nincs név a listában!");

        Map<Character, List<String>> mapOfFirstCharacters = new HashMap<>();

        for (String name : names) {

            //a megadott nevek kezdőbetűi helyett a kezdő katakterekkel dolgozunk
            char firstChar = name.charAt(0);

            //Ha még nincs a map-ben kulcsként az adott karakter, példányosítjuk és hozzáadjuk a listát:
            if (!mapOfFirstCharacters.containsKey(firstChar)) {
                List<String> nameListInMap = new ArrayList<>();
                nameListInMap.add(name);
                mapOfFirstCharacters.put(firstChar, nameListInMap);
            //Ha már benne van a kulcs, lekérdezzük a hozzátartozó listát, hozzáadjuk a nevet,
                // és felülírjuk az adott kulcsot a kibővített listával
            } else {
                List<String> nameListAlreadyInMap = mapOfFirstCharacters.get(firstChar);
                nameListAlreadyInMap.add(name);
                mapOfFirstCharacters.put(firstChar, nameListAlreadyInMap);
            }
        }

        return mapOfFirstCharacters;
    }

}
