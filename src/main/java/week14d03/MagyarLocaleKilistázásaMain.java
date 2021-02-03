package week14d03;


import java.text.Collator;
import java.util.*;

public class MagyarLocaleKilistázásaMain {
    public static void main(String[] args) {

        Locale arrayOfAvailableLocales[] = Collator.getAvailableLocales();
        List<Locale> listOfAvailableLocales = Arrays.asList(arrayOfAvailableLocales);
        Collections.sort(listOfAvailableLocales, Comparator.comparing(Locale::toString));

        for (Locale availableLocale : arrayOfAvailableLocales) {
            System.out.println(availableLocale.toString());
        }

            //tévút
        //System.out.println(Arrays.stream(Collator.getAvailableLocales()).forEach(System.out::println));
    }

}
