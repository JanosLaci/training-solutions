package statements;

import java.util.Scanner;

public class InvestmentMain {
    public static void main(String[] args) {

        Scanner scannerForInvestment = new Scanner(System.in);
        System.out.println("Kérem, adja meg a befektetés összegét!");
        int enteredFund = scannerForInvestment.nextInt();
        String enterhandling = scannerForInvestment.nextLine();

        System.out.println("Kérem, adja meg a kamatlábat egész számként! (x %)");
        int enteredInterestRate = scannerForInvestment.nextInt();
        enterhandling = scannerForInvestment.nextLine();

        Investment myInvestment = new Investment(enteredFund, enteredInterestRate);

        System.out.println("Kérem, adja meg, hány nap hozamát számítsuk ki (az összeg nem lesz forintra kerekítve)!");
        int enteredYieldDays = scannerForInvestment.nextInt();
        enterhandling = scannerForInvestment.nextLine();

        double calculatedYield = myInvestment.getYield(enteredYieldDays);
        System.out.println(myInvestment.getFund() + " Ft hozama: " + calculatedYield + " Ft " + enteredYieldDays + " nap elteltével.");


        System.out.println("Kérem, adja meg, hány nap elteltével veszi ki a befektetését!");
        int enteredCloseDays = scannerForInvestment.nextInt();
        enterhandling = scannerForInvestment.nextLine();

        double myPayOut = myInvestment.close(enteredCloseDays);
        System.out.println("A költségek levonása után " + myPayOut + " Ft összeget fizetünk ki.");

        System.out.println("Kérem, adja meg, hány nap elteltével venné ki újra a befektetését!");
        int enteredAfterCloseDays = scannerForInvestment.nextInt();
        enterhandling = scannerForInvestment.nextLine();

        double myDoublePayOut = myInvestment.close(enteredCloseDays);
        System.out.println("A költségek levonása után " + myDoublePayOut + " Ft összeget fizetünk ki.");


        System.out.println("Kérem, adja meg személyes adatait, hogy az ismételt felvételi kísérlet miatt értesíthessük a hatóságokat!");


    }

}
