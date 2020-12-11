package enumtype.week;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WorkdayCalculatorMain {

    public static void main(String[] args) {
        List<DayType> listToPrint = new ArrayList<>();
        Scanner scannerForWorkDayCalculator = new Scanner(System.in);
        System.out.println("Please enter the name of the starting day.");
        String scannerInputString = scannerForWorkDayCalculator.nextLine().toUpperCase();
        Day scannerInputDay = Day.valueOf(scannerInputString);

        // Miért nincs szükség erre? :
        // String enterHandler = scannerForWorkDayCalculator.nextLine();

        System.out.println("Please enter how many days you would like to list.");
        int scannerInputInt = scannerForWorkDayCalculator.nextInt();

        // for testing without a Scanner: Day inputDay = Day.SUNDAY;
        // int numberOfDays = 7;

        listToPrint = WorkdayCalculator.dayTypes(scannerInputDay, scannerInputInt);

        for (DayType dayTypeItem : listToPrint) System.out.println(dayTypeItem.name().toLowerCase());


    }

}
