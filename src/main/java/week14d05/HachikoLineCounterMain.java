package week14d05;

import java.nio.file.Path;
import java.util.Map;

public class HachikoLineCounterMain {

    public static void main(String[] args) {

        HachikoLineCounter hachikoLineCounter = new HachikoLineCounter();
        Path path = Path.of("src/main/resources/week14d05/hachiko.srt");

        Map<String, Integer> myLineCounterToWordsMap
                = hachikoLineCounter.countWords(path, "Hachiko", "haza", "pályaudvar", "jó", "");

        System.out.println(myLineCounterToWordsMap);

    }
}
