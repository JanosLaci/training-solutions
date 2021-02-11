package sandboxLocales;

import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class LocalesFromStream {

    public static void main(String[] args) {

        //Ez nyilván csak a tömb referenciájét írja ki:
        // System.out.println(Locale.getAvailableLocales())

        Locale[] localesGotInArray = Locale.getAvailableLocales() ;

        //Ez is csak a tömb referenciáját írja ki:
        //System.out.println(localesGotInArray.toString());

        //Így írja ki az országot és a nyelvet:
        //System.out.println(localesGotInArray[5].getDisplayCountry());
        //System.out.println(localesGotInArray[5].getDisplayLanguage());
        //Nive
        // English

        Stream<Locale> localeStream = Arrays.stream(localesGotInArray);

        //groupingBy alapesetben List-át tesz a valuek-ba (értékekbe):
        Map<String, List<Locale>> countryToLocales = localeStream.collect(groupingBy(Locale::getCountry));

        //Ha a map értékeibe Set-et tennénk:
        //stream has already been operated upon or closed elkerülése:

        Stream<Locale> localeStreamAnother = Arrays.stream(localesGotInArray);

        //a toSet() a groupingBy-on belülre kerül, nem a collect-en belülre:

        Map<String, Set<Locale>> countryToLocalesSet =  localeStreamAnother.collect(groupingBy(Locale::getCountry, toSet()));




        Set<Locale> geLocales = countryToLocalesSet.get("GE");
        System.out.println(geLocales.toString());


        //ország nagybetű, nyelv kisbetű
        List<Locale> hungarianLocales = countryToLocales.get("HU");

        //System.out.println(hungarianLocales);
        //[hu_HU]

        //System.out.println(hungarianLocales.get(0));
        //hu_HU
        //System.out.println(hungarianLocales.get(1));
        //Index 1 out of bounds for length 1

        Stream<Locale> localeStreamYetAnother = Arrays.stream(localesGotInArray);

        Map<Boolean, List<Locale>> isEnglishSpoken = localeStreamYetAnother.collect(
                partitioningBy(loc -> loc.getLanguage().equals("en")));

        // A gyűjtés során a "true" nyilván NEM String
        // List<Locale> englishSpeakingLocalesList = isEnglishSpoken.get("true");
        // null


        List<Locale> englishSpeakingLocalesList = isEnglishSpoken.get(true);


        System.out.println(englishSpeakingLocalesList);
        System.out.println(englishSpeakingLocalesList.size());

        Stream<Locale> localeStreamForCounting = Arrays.stream(localesGotInArray);


        Map<String, Long> localeCountsByCountryToCountryMap
                = localeStreamForCounting.collect(groupingBy(Locale::getCountry, counting()));






    }

}
