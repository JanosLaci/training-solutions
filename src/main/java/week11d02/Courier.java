package week11d02;


//Junior
//A feladatban egy biciklis futár egy heti munkáját rögzítjük és készítünk statisztikákat.
//A futár minden fuvar után feljegyzi, hogy a hét hányadik napján történt a fuvar.
// Ezután azt, hogy az adott nap hányadik fuvarját teljesítette és ezután azt, hogy hány kilométer volt az adott fuvar.
//A futár egy-egy fuvarját reprezentálja a Ride nevű osztály, adattagokkal, konstruktorral, getterekkel.
//Készítsd el a Courier osztályt. Ez fogja a futárt reprezentálni. Legyen egy rides listája ami fuvarokat tárol.
// Legyen egy addRide metódus, ami csak sorrendben enged hozzáadni elemeket a listához.
// Figyeljünk viszont arra, hogy nem feltétlenül minden nap dolgozott a futár,
// de ha már bekerült egy 3. napi fuvar, akkor ne kerülhessen be egy 2. napi. És arra is figyelj,
// hogy a napon belül is sorrendben kerüljenek be az adatok.
// Ha a paraméterül kapott Ride nem felel meg a feltételeknek dobjunk IllegalArgumentException-t.
//pl egy helyes listára: 1 1 12 1 2 11 2 1 10 4 1 19
//Készíts egy metódust, ami visszad egy napot amikor a futár nem dolgozott. Ha több ilyen nap is van akkor a korábbit!
//https://github.com/Training360/strukturavalto-java-public/blob/master/orai-feladatok.md


import java.util.ArrayList;
import java.util.List;

public class Courier {


    private List<Ride> rides = new ArrayList<>();

    public Courier(List<Ride> rides) {
        this.rides = rides;
    }

    public Courier() {

    }

    public List<Ride> getRides() {
        return rides;
    }

    public void addRide(Ride ride) {
        if (ride == null) throw new IllegalArgumentException("No rides.");

        if (rides.size() < 1) {
            if (ride.getRideNumber() == 1) {
                rides.add(ride);
                return;
            } else {
                throw new IllegalArgumentException("Not the first ride");
            }

        } else {
            if (rides.get(rides.size() - 1).getDayNumber() > ride.getDayNumber()) {
                throw new IllegalArgumentException("Invalid day number");
            }
            if (rides.get(rides.size() - 1).getDayNumber() < ride.getDayNumber() && ride.getRideNumber() == 1) {
                rides.add(ride);
                return;
            }
            if (rides.get(rides.size() - 1).getDayNumber() == ride.getDayNumber() && rides.get(rides.size() - 1).getDayNumber() + 1 == ride.getRideNumber()) {
                rides.add(ride);
                return;
            }

            throw new IllegalArgumentException("Invalid ride number");

        }

    }
    public int getEarliestHoliday() {
        int firstHoliday = 0;
        for (int i = 1; i <= 7; i++) {
            for (Ride actual : rides) {
                if (i == actual.getDayNumber()) {
                    firstHoliday++;
                }

            }
            if (firstHoliday == 0) {
                return i;
            }
            firstHoliday = 0;
        }
        return -1;

    }

}
