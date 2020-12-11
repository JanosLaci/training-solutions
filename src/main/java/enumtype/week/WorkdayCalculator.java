package enumtype.week;

import java.util.ArrayList;
import java.util.List;

public class WorkdayCalculator {

    //Használj egy private Day nextDay(Day day) segédmetódust,
// mely megmondja a paraméterként megadott nap után következő napot! Vasárnap után hétfő következik.
//Teszteld a WorkdayCalculatorMain osztály main() metódusában!

    public static Day nextDay(Day day){
        Day nextD;

        if (day == Day.SUNDAY) nextD = Day.MONDAY;
        else {
            int inputDayIndex;
            int nextDayIndex;
            inputDayIndex = day.ordinal();
            nextDayIndex = inputDayIndex + 1;
            nextD = Day.values()[nextDayIndex];
        }

        return nextD;


    }


    // A WorkdayCalculator osztályban legyen egy List<DayType> dayTypes(Day firstDay, int numberOfDays) metódus,
// melynek meg kell mondani az első napot, majd az utána következő napok számát, és visszaad egy listát,
// mely azt tartalmazza, hogy a i. nap milyen típusú!

//szokásos bejárás nem megfelelő, nexDay használandó
    //public static List<DayType> dayTypes(Day firstDay, int numberOfDays){
    //        List<DayType> dayTypeList = new ArrayList<>();
    //        int startIndex = firstDay.ordinal();
    //        int endIndex = startIndex + numberOfDays;
    //
    //        for (int i = startIndex; i < endIndex; i++ ) {
    //            dayTypeList.add(Day.values()[i].typeOfDay);
    //        }
    //
    //        return dayTypeList;
    //    }

    public static List<DayType> dayTypes(Day firstDay, int numberOfDays){
        List<DayType> dayTypeList = new ArrayList<>();
        Day dayToAdd = firstDay;

        for (int i = 0; i < numberOfDays; i++ ) {
            dayTypeList.add(dayToAdd.typeOfDay);
            dayToAdd = nextDay(dayToAdd);
        }

        return dayTypeList;
    }





}
