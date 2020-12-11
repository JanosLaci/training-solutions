package week07d05;


//Adam Arold  12:50 PM
//Mai junior/medior feladat:
//Készíts a week07d05 csomagba egy Vehicle, egy Car, egy Truck és egy Motorcycle osztályt.
//A Vehicle osztálynak legyen egy int getNumberOfGears és egy TransmissionType getTransmissionType metódusa.
// A fenti osztályok értelemszerűen öröklődjenek egymásból
// és mindegyiknek implementálja a sebességek számát és a váltó típusát.
// A lehetséges váltótípusok: MANUAL, AUTOMATIC, SEQUENTIAL. A
// z alapértelmezett váltó típus (a Vehicle osztályban) MANUAL,de a Car automatikus, míg a Motorcycle SEQUENTIAL.
// Az alapértelmezett sebesség szám 5.

public class Vehicle {
    int NumberOfGears = 5;
    TransmissionType transmissionType = TransmissionType.MANUAL;


    public int getNumberOfGears() {
        return NumberOfGears;
    }

    public TransmissionType getTransmissionType() {
        return transmissionType;
    }
}
