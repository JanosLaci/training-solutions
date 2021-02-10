/*
package week16d03;

import java.lang.Math;
*/
/*
Adott egy vetélkedő kérdésbankja egy fájlban. A fálban az egy kérdéshez tartozó adatok két sorban helyezkednek el.
Első sorban a kérdés, a második sorban a válasz a pontszám és a téma szóközzel elválasztava. Olvasd be a fájl tartalmát
 a memóriába, majd oldjátok meg a lenti feladatokat.
```
Mikor volt a mohacsi vesz?
1526 1 tortenelem
Melyik evben bomlott fel a Nyugat-Romai Birodalom?
476 1 tortenelem
Melyik a legkisebb primszam?
2 1 matematika
Mennyi 64 kobgyoke?
4 2 matematika
Hany atloja van a szabalyos nyolcszognek?
24 2 matematika
Melyik evben kezdodott a Honfoglalas?
895 1 tortenelem
Mikor adtak ki az Aranybullat?
1222 1 tortenelem
Melyik evben adtak ki Angliaban a Magna Chartat?
1215 3 tortenelem
```
1. Írj egy metódust, melynek paramétere a téma és add vissza, az összes kérdést abban a témában. (Csak a kérdéseket)
2. Írj egy metódust, ami random sorsol ki egy kérdést, és adja vissza annak összes adatát.
3. Készíts egy metódust ami rendszerezi a kérdéseket témakörönként. Visszatér egy datszerkezetben amelyben témánként megtalálható az összes kérdés.
4. Az előző feladat segítségével határozd meg, hogy melyik téma kérdései érik a legtöbb pontot (összpontszám)!
 *//*

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
public class Csoportmunka {
    List<Topic>topics = new ArrayList<>();
    public void readFile() {
        Path path = Path.of("kerdesek.txt");
        List<String> lines;

        {
            try {
                lines = Files.readAllLines(path);
                String question= null;
                int answer;
                int points;
                String topic;
                for(int i=0; i< lines.size()-1; i++){
                    if( i% 2 ==0) {
                        question = lines.get(i);
                    }else{
                        String [] answerLine = lines.get(i).split(" ");
                        answer = Integer.parseInt(answerLine[0]);
                        points = Integer.parseInt(answerLine[1]);
                        topic = answerLine[2];
                        topics.add(new Topic(answer, points, topic, question));
                    }
                }
            } catch (IOException ioe) {
                throw new IllegalArgumentException("Cannot read file", ioe);
            }
        }
    }


    public List<String> questionsPerTopics(String tema){
        List<String>result = new ArrayList<>();
        for( Topic t : topics){
            if(tema.equals(t.getTopic())){
                result.add(t.getQuestion());
            }
        }
        return result;
    }
    public int getRandomIntForQuestions() {
        int veletlenszam = 0;
        //57 kérdés van
        int max = topics.size();
        int min = 1;
        int range = max - min + 1;
        veletlenszam = (int) (Math.random() * range) + min;
        return veletlenszam;
    }
    public Topic getRandomTopic(){
        return topics.get(getRandomIntForQuestions());
    }
    public Map<String, List<Topic>> getGoupedTopics() {
        Map<String, List<Topic>> topicMap = new TreeMap<>();
        for(Topic t: topics) {
            topicMap.put(t.getTopic(), t.getTopic().)
        }
    }
}*/
