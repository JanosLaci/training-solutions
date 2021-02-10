package week16d03;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
public class Csoportmunka2 {
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
    public Map<String, List<String>> getGoupedTopics() {
        Map<String, List<String>> topicMap = new TreeMap<>();
        for(Topic t: topics) {
            if(!topicMap.containsKey(t.getTopic())) {
                topicMap.put(t.getTopic(), questionsPerTopics(t.getTopic()));
            }
        }
        return topicMap;
    }

}