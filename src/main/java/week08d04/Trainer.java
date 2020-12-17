package week08d04;

public class Trainer {
    private CanMark canMarkTrainerAttribute;

    public int giveMark(){
        return canMarkTrainerAttribute.giveMark();

    }

    public Trainer(CanMark canMarkTrainerAttribute) {
        this.canMarkTrainerAttribute = canMarkTrainerAttribute;
    }





}
