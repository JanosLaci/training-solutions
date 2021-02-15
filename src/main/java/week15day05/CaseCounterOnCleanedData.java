package week15day05;

//Viczián István  12:26 PM
//Junior feladat:
//Letölthetőek a koronavírus adatok innen:
// https://opendata.ecdc.europa.eu/covid19/casedistribution/csv/data.csv
// Melyik három héten volt Magyarországon a legtöbb esetszám?
//Senior feladat
//Összegezd országonként az esetszámokat, és add vissza azt a három
//országot, ahol az összes esetszám populációra arányosítva a legnagyobb.

//Megj.: . a file tisztítva a "-ra, vessző is kivéve ("Bonaire, Saint Eustatius and Saba", blank, 0, negatív)
// file elérése: "src/main/resources/week15d05/dataCleanedNoBlanksNoNegatives.csv"
// header                       index
// dateRep,                     0
// year_week,                   kell: 1
// cases_weekly,                kell: 2
// deaths_weekly,               3
// countriesAndTerritories,     kell: 4
// geoId,                       5
// countryterritoryCode,        6
// popData2019,                 kell: 7
// continentExp,notification_rate_per_100000_population_14-days

//Minta:
// 8/2/2021,2021-05,238,8,Afghanistan,AF,AFG,38041757,Asia,1.33

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class CaseCounterOnCleanedData {

    static Stream<weeklyCase> readInWeeklyCasesAsStream(Path path)  {

        try { return Files.lines(path)
                .map(l -> l.split(","))
                .map(a -> new weeklyCase(a[4], a[1], Integer.parseInt(a[2]), Integer.parseInt(a[7])));
        } catch (IOException ioException) { throw new IllegalStateException("Cannot read the file."); }
    }

    public static void main(String[] args) {

        Path path = Path.of("src/main/resources/week15d05/dataCleanedNoBlanksNoNegatives.csv");
        Stream<weeklyCase> weeklyCaseStream;

        //Melyik három héten volt Magyarországon a legtöbb esetszám?

        weeklyCaseStream = readInWeeklyCasesAsStream(path);

        Map<String, Optional<Integer>> highestCaseCountMap = weeklyCaseStream
                .filter(weeklyCase -> weeklyCase.getCountry().equals("Hungary"))
                .collect(groupingBy(weeklyCase::getCountry,
                        mapping(weeklyCase::getCases, maxBy(Comparator.naturalOrder()))));

        int highestCaseCount = highestCaseCountMap.get("Hungary").get();

        System.out.println(highestCaseCount);

        //39170 átírása még egy helyen, mindkettőt visszaadja:

        weeklyCaseStream = readInWeeklyCasesAsStream(path);

        Map<String, String> highestCaseWeekId = weeklyCaseStream
                .filter(weeklyCase -> weeklyCase.getCountry().equals("Hungary"))
                .filter(weeklyCase -> weeklyCase.getCases() == highestCaseCount)
                .collect(groupingBy(weeklyCase::getWeekIdentifier
                        , mapping(weeklyCase::getWeekIdentifier, joining(","))));

        System.out.println(highestCaseWeekId);




    }


}
