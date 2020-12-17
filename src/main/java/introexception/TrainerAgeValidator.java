package introexception;

public class TrainerAgeValidator {



    public boolean isValidAge(String age){
        try {if (Integer.parseInt(age)<Trainer.MIN_AGE) return false;}
        catch (NumberFormatException numberFormatException) {return false;}



        return true;
    }




}
