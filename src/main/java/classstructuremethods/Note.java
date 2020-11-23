package classstructuremethods;

public class Note {
    //Fejlesztés során ezentúl mindig tartsd be az information hiding elvet, azaz az attribútumok legyenek privátak,

    private String name, topic, text;

    //és készíts hozzájuk gettereket és settereket!


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    //Készíts egy getNoteText() metódust, mely az osztály attribútumai alapján egyetlen szöveget ad vissza name: (topic) text formátumban!

    public String getNoteText(){
        String printedNameTopicText = name + ": (" + topic + ") " + text;
        System.out.println(printedNameTopicText);
        return printedNameTopicText;

    }

}
