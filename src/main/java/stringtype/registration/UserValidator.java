package stringtype.registration;

public class UserValidator {

    public boolean isValidUserName (String username){
        return !(username.isBlank());


    }

    public boolean isValidPassword(String password1, String password2){
        if (!password1.equals(password2)) {
            return false;
        }
            else if (password1.length()<8) {
                return false;
            }
                else {return !(password1.isBlank());}

    }

    public boolean isValidUserEmail (String email){
        int placeOfAt = email.indexOf('@');
        // több pont is lehet az e-mailben
        int placeOfLastPoint = email.lastIndexOf('.');
        int emailLength = email.length();

        if (
                (placeOfAt == -1) ||
                (placeOfLastPoint == -1) ||
                (emailLength<5) ||
                (placeOfAt<1) ||
                (placeOfLastPoint - 1 == emailLength) ||
                (placeOfLastPoint - placeOfAt <= 1)
            )       {return false;}
                    else  {return true ;}




    }


}
