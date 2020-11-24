package classstructureintegrate;

import java.util.Scanner;

public class Bank {


    public static void main(String[] args) {

        Scanner scannerForBank = new Scanner(System.in);
        System.out.println("Kérem, adja meg a terhelendő számla adatait az átutaláshoz!");
        System.out.println("Számlaszám?");
        String accoutNumberStringFrom = scannerForBank.nextLine();
        System.out.println("Tulajdonos?");
        String ownerStringFrom = scannerForBank.nextLine();
        System.out.println("Egyenleg?");
        int balanceIntFrom = scannerForBank.nextInt();
        String enterHandler = scannerForBank.nextLine();

        BankAccount fromBankAccount = new BankAccount(accoutNumberStringFrom, ownerStringFrom, balanceIntFrom);

        System.out.println("Kérem, adja meg a célszámla adatait az átutaláshoz!");
        System.out.println("Számlaszám?");
        String accoutNumberStringTo = scannerForBank.nextLine();
        System.out.println("Tulajdonos?");
        String ownerStringTo = scannerForBank.nextLine();
        System.out.println("Egyenleg?");
        int balanceIntTo = scannerForBank.nextInt();
        enterHandler = scannerForBank.nextLine();

        BankAccount toBankAccount = new BankAccount(accoutNumberStringTo, ownerStringTo, balanceIntTo);

        System.out.println("Kérem, adja meg az átutalandó összeget forintban!");
        int transferInt = scannerForBank.nextInt();

        fromBankAccount.transfer(toBankAccount,transferInt);

    }


}
