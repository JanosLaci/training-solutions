package sandboxCities;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;
import static java.util.stream.Collectors.joining;

class TestForCities {

    //a txt fileból visszaadunk egy City Stream-et
    // Files.lines(path): path alapján String-ként a sorok
    // szóközre figyelni kell: ", "
    // split String tömböt ad vissza -> 0. eleme a név stb.
    static Stream<City> readCities(String filename) throws IOException {
        return Files.lines(Path.of(filename)).map(l -> l.split(", ")).map(a -> new City(a[0], a[1], Integer.parseInt(a[2])));
    }

    public static void main(String[] args) throws IOException {

        //államonként a population int-ek összeadása Map-ben: <String, Integer>
        // groupingBy a City state getterével: City::getState
        // summingInt a City population getterével
        // summing nyilván numerikus-ra vonatkozik, groupingBy nyilván kategorikus változóra (state)


        Stream<City> cities = readCities("src/main/resources/sandboxForCities/cities.txt");
        Map<String, Integer> stateToCityPopulation = cities.collect(
                groupingBy(City::getState, summingInt(City::getPopulation)));
        System.out.println("stateToCityPopulation: " + stateToCityPopulation);

        //a stream végével sem kell újra deklarálni a stream változót
        //state csoportosítás, majd nevekhez a hossz, ezért mapping is kell
        //String összehasonlításhoz Comparator

        cities = readCities("src/main/resources/sandboxForCities/cities.txt");
        Map<String, Optional<String>> stateToLongestCityName = cities.collect(
                groupingBy(City::getState,
                        mapping(City::getName,
                                maxBy(Comparator.comparing(String::length)))));

        System.out.println("stateToLongestCityName: " + stateToLongestCityName);


        cities = readCities("src/main/resources/sandboxForCities/cities.txt");
        Map<String, IntSummaryStatistics> stateToCityPopulationSummary = cities.collect(
                groupingBy(City::getState,
                        summarizingInt(City::getPopulation)));
        System.out.println(stateToCityPopulationSummary.get("NY"));

        cities = readCities("src/main/resources/sandboxForCities/cities.txt");
        Map<String, String> stateToCityNames = cities.collect(
                groupingBy(City::getState,
                        reducing("", City::getName,
                                (s, t) -> s.length() == 0 ? t : s + ", " + t)));

        cities = readCities("src/main/resources/sandboxForCities/cities.txt");
        stateToCityNames = cities.collect(
                groupingBy(City::getState,
                        mapping(City::getName,
                                joining(", "))));
        System.out.println("stateToCityNames: " + stateToCityNames);
    }



}
