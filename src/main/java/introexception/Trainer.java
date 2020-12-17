package introexception;

public class Trainer {

    //public  static final int sorrend is jó, de a static kell

    public final static int MIN_AGE = 18;

    private String name;
    private int age;

    public Trainer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getMIN_AGE() {
        return MIN_AGE;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
