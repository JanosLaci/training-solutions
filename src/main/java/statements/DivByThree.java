package statements;

import java.util.Scanner;

public class DivByThree {


    public static void main(String[] args) {
        Scanner scannerForDivBythree = new Scanner(System.in);
        System.out.println("Kérem, adjon meg egy egész számot, aminek vizsgáljuk a hárommal való oszthatóságát!");
        int divideByThree = scannerForDivBythree.nextInt();
        //Gyakorlás érdekében nem használunk zárójelet, olvashatóbb lenne:  ... = (divideByThree % 3 == 0)
        boolean divisibleByThree = divideByThree % 3 == 0;

        System.out.println("Osztható hárommal: " + divisibleByThree);


    }

}
