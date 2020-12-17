package week08d04;

public class TrainerMain {

    public static void main(String[] args) {

        //4 példány jön létre
        Trainer goodTeacher = new Trainer(new GoodMood());
        Trainer badTeacher = new Trainer(new BadMood());


        System.out.println(goodTeacher.giveMark());
        System.out.println(badTeacher.giveMark());


    }
}
