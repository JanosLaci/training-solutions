package statements;

import java.util.Scanner;

public class TimeMain {
    public static void main(String[] args) {

        Scanner scannerForTime = new Scanner(System.in);
        System.out.println("Kérem, adja meg az első időpontot!");
        System.out.println("Óra?");
        int myHour1 = scannerForTime.nextInt();
        String enterHandler = scannerForTime.nextLine();
        System.out.println("Perc?");
        int myMinute1 = scannerForTime.nextInt();
        enterHandler = scannerForTime.nextLine();
        System.out.println("Másodperc?");
        int mySecond1 = scannerForTime.nextInt();
        enterHandler = scannerForTime.nextLine();

        Time myTime1 = new Time(myHour1, myMinute1, mySecond1);

        System.out.println("Kérem, adja meg a második időpontot!");
        System.out.println("Óra?");
        int myHour2 = scannerForTime.nextInt();
        enterHandler = scannerForTime.nextLine();
        System.out.println("Perc?");
        int myMinute2 = scannerForTime.nextInt();
        enterHandler = scannerForTime.nextLine();
        System.out.println("Másodperc?");
        int mySecond2 = scannerForTime.nextInt();
        enterHandler = scannerForTime.nextLine();

        Time myTime2 = new Time(myHour2, myMinute2, mySecond2);

        //Az első időpont 12:3:43 = 723 perc
        //A második időpont 4:21:38 = 15698 másodperc
        //Az első korábbi, mint a második: false

        System.out.println("Az első időpont " + myTime1.toString() + " = " + myTime1.getInMinutes() + " perc");
        System.out.println("A második időpont " + myTime2.toString() + " = " + myTime1.getInSeconds() + " másodperc");
        System.out.println("Az első korábbi, mint a második: " + myTime1.earlierThan(myTime2));




    }
}
