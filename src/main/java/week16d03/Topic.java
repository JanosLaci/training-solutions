package week16d03;

public class Topic {

    int answer;
    int points;
    String topic;
    String question;

    public Topic(int answer, int points, String topic, String question) {
        this.answer = answer;
        this.points = points;
        this.topic = topic;
        this.question = question;
    }

    public int getAnswer() {
        return answer;
    }

    public int getPoints() {
        return points;
    }

    public String getTopic() {
        return topic;
    }

    public String getQuestion() {
        return question;
    }
}
