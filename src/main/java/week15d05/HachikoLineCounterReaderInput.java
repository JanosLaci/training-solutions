package week15d05;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.TreeMap;

public class HachikoLineCounterReaderInput {

    Map<String, Integer> countWordsReaderInput(Reader reader, String... inputWordsToFindInLines){

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
            BufferedReader bufferedReader = new BufferedReader(reader);
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

    public static void main(String[] args) throws IOException {

        Reader reader = Files.newBufferedReader(Path.of("src/main/resources/week15d05/hachiko.srt"));

        HachikoLineCounterReaderInput hachikoLineCounterReaderInput = new HachikoLineCounterReaderInput();
        Map<String , Integer> mapToPrint =
                hachikoLineCounterReaderInput.countWordsReaderInput(reader, "jó", "");


        System.out.println(mapToPrint);

    }



}
