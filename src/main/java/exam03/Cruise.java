package exam03;

//Utazási iroda hajóutakat szervez.
// Minden hajóút egy adott hajóval történik, amelynek neve és befogadóképessége egy Boat osztályban van tárolva.
//Az utasok adott hajóra, adott osztályra foglalnak helyet.
// A helyfoglaláskor azonban ellenőrizni kell, hogy a befogadóképesség alapján van-e még hely.
// Ha nincs, egy kivételt várunk a megfelelő szöveggel.
// A CruiseClass enum tárolja a különböző osztályokat. LUXURY, FIRST és SECOND osztályok vannak.
// Az ár számolása úgy történik, hogy venni kell a hajóhoz tartozó alapárat,
// és meg kell szorozni az osztályhoz tartozó szorzóval, rendre 3,0, 1,8 és 1,0.



import java.time.LocalDate;
import java.util.*;

public class Cruise {

    private Boat boat;
    private LocalDate sailing;
    private double  basicPrice;
    private List<Passenger> passengers = new ArrayList<>();

    public Cruise(Boat boat, LocalDate sailing, double basicPrice) {
        this.boat = boat;
        this.sailing = sailing;
        this.basicPrice = basicPrice;
    }

    public Boat getBoat() {
        return boat;
    }

    public LocalDate getSailing() {
        return sailing;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }





    public void bookPassenger(Passenger inputPassenger) {
        if (passengers.size() >= boat.maxPassengers)
            throw new IllegalArgumentException("Booking failed: Boat capacity reached.");

        else passengers.add(inputPassenger);

    }

    public double getPriceForPassenger(Passenger passenger) {
        //Egyszerűbb:
        // return basicPrice * passenger.cruiseClass.surchargeMultiplicator;
        //Szebb:
        double inYourDreams;
        inYourDreams = basicPrice * passenger.cruiseClass.surchargeMultiplicator;
        return inYourDreams;

    }

    public Passenger findPassengerByName(String inputName) {
        Passenger firstFoundPassenger;
        for (Passenger passenger: passengers) {
            if (passenger.getName().equals(inputName)) return passenger;
        }

        throw new IllegalArgumentException("No passenger with this name was found.");
    }

    public List<String> getPassengerNamesOrdered() {
        List<String> orderedNames = new ArrayList<>();
        for (Passenger passenger:passengers) {
            orderedNames.add(passenger.getName());
        }
        orderedNames.sort(Comparator.naturalOrder());
        return orderedNames;
    }

    public double sumAllBookingsCharged() {
        double revenue =0;
        for (Passenger passenger: passengers) {
            revenue += getPriceForPassenger(passenger);
        }
        return revenue;
    }

    public Map<CruiseClass, Integer> countPassengerByClass() {
        Map<CruiseClass, Integer> classToCounts = new TreeMap<>();
        int bourgeoise = 0;
        int firstCounts =0;
        int secondCounts = 0;

        for (Passenger passenger : passengers) {
            if (passenger.cruiseClass == CruiseClass.LUXURY) bourgeoise++;
            if (passenger.cruiseClass == CruiseClass.FIRST) firstCounts++;
            if (passenger.cruiseClass == CruiseClass.SECOND) secondCounts++;
        }

        classToCounts.put(CruiseClass.LUXURY, bourgeoise);
        classToCounts.put(CruiseClass.FIRST, firstCounts);
        classToCounts.put(CruiseClass.SECOND, secondCounts);

        return classToCounts;
    }
}
