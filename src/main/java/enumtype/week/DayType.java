package enumtype.week;

//https://e-learning.training360.com/courses/take/java-se-alapok-java-nyelvi-elemek/lessons/10709804-felsorolasos-tipus
//Vegyél fel egy enumtype.week.DayType enumot, melynek két értéke a WORKDAY, HOLIDAY! Vegyél fel egy Day enumot,
// mely a hét napjait tartalmazza, és a szombat és vasárnap legyen megjelölve szünnapnak!
// A WorkdayCalculator osztályban legyen egy List<DayType> dayTypes(Day firstDay, int numberOfDays) metódus,
// melynek meg kell mondani az első napot, majd az utána következő napok számát, és visszaad egy listát,
// mely azt tartalmazza, hogy a i. nap milyen típusú!
//Használj egy private Day nextDay(Day day) segédmetódust,
// mely megmondja a paraméterként megadott nap után következő napot! Vasárnap után hétfő következik.
//Teszteld a WorkdayCalculatorMain osztály main() metódusában!

public enum DayType {
    WORKDAY, HOLIDAY
}



