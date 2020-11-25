package statements;

public class Time {

    private int HoursOfDay, MinutesOfDay, SecondsOfDay;

    //Az automatikusan generált konstruktor nem használja a this-t, mégis működik. Miért?
    // A kurzor tooltip kijelzi, hogy ez az osztály-attribútum, és a színezés is más.

    public Time(int hoursOfDay, int minutesOfDay, int secondsOfDay) {
        HoursOfDay = hoursOfDay;
        MinutesOfDay = minutesOfDay;
        SecondsOfDay = secondsOfDay;
    }


    //A getInMinutes() metódus az időpont értékét percekben adja vissza, de a másodperceket figyelmen kívül hagyja.
    //A getInSeconds() metódus a teljes időpontot másodpercben adja vissza.
    //A earlierThan() metódus paraméterként egy másik Time típusú objektumot kap

    public int getInMinutes(){
        return 60 * HoursOfDay + MinutesOfDay;
    }

    public int getInSeconds(){
        return 60 * 60 * HoursOfDay + 60 * MinutesOfDay + SecondsOfDay;
    }

    public boolean earlierThan(Time OtherTimeObject){
        return OtherTimeObject.getInSeconds() < this.getInSeconds();

    }

    public String toString(){
        return HoursOfDay + ":" + MinutesOfDay + ":" + SecondsOfDay;

    }



    public int getHoursOfDay() {
        return HoursOfDay;
    }

    public void setHoursOfDay(int hoursOfDay) {
        HoursOfDay = hoursOfDay;
    }

    public int getMinutesOfDay() {
        return MinutesOfDay;
    }

    public void setMinutesOfDay(int minutesOfDay) {
        MinutesOfDay = minutesOfDay;
    }

    public int getSecondsOfDay() {
        return SecondsOfDay;
    }

    public void setSecondsOfDay(int secondsOfDay) {
        SecondsOfDay = secondsOfDay;
    }







    }

