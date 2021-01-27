package week13d02;

import java.time.LocalTime;

public class Flight {
    private String flightID;
    private FlightDirection flightDirection;
    private String flightCity;
    private LocalTime flightTime;


    public Flight(String flightID, FlightDirection flightDirection, String flightCity, LocalTime flightTime) {
        this.flightID = flightID;
        this.flightDirection = flightDirection;
        this.flightCity = flightCity;
        this.flightTime = flightTime;
    }


    public String getFlightID() {
        return flightID;
    }

    public FlightDirection getFlightDirection() {
        return flightDirection;
    }

    public String getFlightCity() {
        return flightCity;
    }

    public LocalTime getFlightTime() {
        return flightTime;
    }
}
