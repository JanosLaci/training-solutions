package enumtype.week;

public enum Day {
    MONDAY(DayType.WORKDAY),
    TUESDAY(DayType.WORKDAY),
    WEDNESDAY(DayType.WORKDAY),
    THURSDAY(DayType.WORKDAY),
    FRIDAY(DayType.WORKDAY),

    SATURDAY(DayType.HOLIDAY),
    SUNDAY(DayType.HOLIDAY);

    DayType typeOfDay;

    Day(DayType typeOfDay){
        this.typeOfDay = typeOfDay;
    }



}



