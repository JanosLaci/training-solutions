package week13d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Airport {

    static List<String> stringRowsFromFile (){
       Path filePath = Path.of("src/main/resources/week13d02/cities.txt");
       List<String> stringRowsList = new ArrayList<>();

       //kérdés: Miért nem elég a try után deklarálni a line változót?

       String line;

        try {
            BufferedReader bufferedReader = Files.newBufferedReader(filePath);
            while ((line = bufferedReader.readLine()) != null) {
                stringRowsList.add(line);
            }
        } catch (IOException e) {
            throw new IllegalStateException("Cannot read file");
        }
        return stringRowsList;
    }


    static List<Flight> flighListFromStringRows(List<String> inputList){
        List<Flight> flightList = new ArrayList<>();

        for (String stringRow:
             inputList) {
            String[] rowParts = stringRow.split(" ");
            flightList.add(new Flight(
                    rowParts[0],
                    //(rowParts[1].equals("Arrival") ? FlightDirection.ARRIVAL : FlightDirection.DEPARTURE),
                    FlightDirection.valueOf(rowParts[1].toUpperCase()),
                    rowParts[2],
                    LocalTime.parse(rowParts[3]))     );

        }
        return flightList;
    }






}
