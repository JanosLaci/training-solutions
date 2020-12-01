package stringtype.registration;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {

        Scanner scannerForRegistration = new Scanner(System.in);

        System.out.println("Felhasználónév?");
        String myName = scannerForRegistration.nextLine();
        System.out.println("Jelszó?");
        String myPassword1 = scannerForRegistration.nextLine();
        System.out.println("Jelszó még egyszer?");
        String myPassword2 = scannerForRegistration.nextLine();
        System.out.println("E-mail?");
        String myEmail = scannerForRegistration.nextLine();

        UserValidator myUserValidator = new UserValidator();



        System.out.println( myUserValidator.isValidUserName(myName) ? "Felhasználónév megfelelő" : "Felhasználónév nem megfelelő.");
        System.out.println( myUserValidator.isValidPassword(myPassword1, myPassword2)  ? "Jelszó megfelelő" : "Jelszó nem megfelelő.");
        System.out.println( myUserValidator.isValidUserEmail(myEmail) ? "E-mail megfelelő" : "E-mail nem megfelelő.");

    }

}
