package sandboxLocales;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

class LocalesFromStreamTextbook {

    public static void main(String[] args) {


    Stream<Locale> locales = Stream.of(Locale.getAvailableLocales());
    Map<String, List<Locale>> countryToLocales = locales.collect(
            Collectors.groupingBy(Locale::getCountry));
        System.out.println("Swiss locales: " + countryToLocales.get("CH"));

    locales = Stream.of(Locale.getAvailableLocales());
    Map<Boolean, List<Locale>> englishAndOtherLocales = locales.collect(
            Collectors.partitioningBy(l -> l.getLanguage().equals("en")));
        System.out.println("English locales: " + englishAndOtherLocales.get(true));

    locales = Stream.of(Locale.getAvailableLocales());
    Map<String, Set<Locale>> countryToLocaleSet = locales.collect(
            groupingBy(Locale::getCountry, toSet()));
        System.out.println("countryToLocaleSet: " + countryToLocaleSet);

    locales = Stream.of(Locale.getAvailableLocales());
    Map<String, Long> countryToLocaleCounts = locales.collect(
            groupingBy(Locale::getCountry, counting()));
        System.out.println("countryToLocaleCounts: " + countryToLocaleCounts);


        locales = Stream.of(Locale.getAvailableLocales());
        Map<String, Set<String>> countryToLanguages = locales.collect(
                groupingBy(Locale::getDisplayCountry,
                        mapping(Locale::getDisplayLanguage,
                                toSet())));
        System.out.println("countryToLanguages: " + countryToLanguages);
    }

}
