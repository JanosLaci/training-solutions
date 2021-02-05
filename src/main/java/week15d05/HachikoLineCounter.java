package week15d05;

//Viczián István  9:00 AM
//## Junior/mid-level
//A examples/week14d05/hachiko.srt van a Hachiko film felirata. Írj egy
//countWords() metódust, mely paraméterül várja a fájlt, varargsban
//szavakat. Megszámolja, hogy melyik szó hány sorban szerepel a
//szövegben. Legyenek mondjuk a beadott szavak: "Hachiko", "haza",
//"pályaudvar", "jó"

//Megj.: A file elérési útja : src/main/resources/week15d05/hachiko.srt

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.TreeMap;

public class HachikoLineCounter {



    Map<String, Integer> countWords(Path path, String... inputWordsToFindInLines){

        //Feltételezés: legalább egy szót meg kell adni
        if (inputWordsToFindInLines.length<1) throw new IllegalArgumentException("No input words found.");

        //Treemap választása, hogy a szavak rendezettek legyenek a kulcsban
        Map<String, Integer> wordsToLineCountsMap = new TreeMap<>();
        //map előzetes feltöltése 0 értékekkel, hiszen ha nincs adott feltételnek megfelelő sor, akkor a sorok száma 0
        for (String word:inputWordsToFindInLines) {
            wordsToLineCountsMap.put(word,0);
        }

        //megadott path alapján beolvasás soronként
        try {
            BufferedReader bufferedReader = Files.newBufferedReader(path);
            String line;
            while ((line=bufferedReader.readLine())!=null){
                for (String word : wordsToLineCountsMap.keySet()) {
                    if (line.contains(word)) {
                        int lineCountThisFar = wordsToLineCountsMap.get(word);
                        int newLineCount = lineCountThisFar +1;
                        wordsToLineCountsMap.put(word, newLineCount);
                    }
                }
            }
        } catch (IOException ioException) {
            throw new IllegalStateException("Cannot read the file.", ioException);
        }

        return wordsToLineCountsMap;
    }

}

/* Alábbi tévút, inkább egyszerűsítés: a szó elmaradása kivételt dob
    Map<String, Integer> countWords(Path path, String firstWordToFindInLines, String... optionallyOtherWordsToFindInLines){

        int numberOfWordsToFind = 1 + optionallyOtherWordsToFindInLines.length;
        int[] counterArray = new int[numberOfWordsToFind];

        try {
            BufferedReader bufferedReader = Files.newBufferedReader(path);
            String line;
            while ((line=bufferedReader.readLine())!=null){


            }


        } catch (IOException ioException) {
            throw new IllegalStateException("Cannot red the file.", ioException);
        }


        return counterArray;

    }*/

    /* tévút: használjuk a már létrehozott mapet
                for (String word: inputWordsToFindInLines) {
                    int lineCounter = 0;
                    if (line.contains(word)) lineCounter++;


                }*/

