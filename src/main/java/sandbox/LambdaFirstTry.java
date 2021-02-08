package sandbox;

import static java.lang.System.out;

class LambdaFirstTry {

    @FunctionalInterface
    interface Konvertáló<típusaAmibőlAkarszkonvertálni, típusaAnnakAmitEredményülVársz> {
        típusaAnnakAmitEredményülVársz metódusElnevezéseAmitHasználniAkarsz(típusaAmibőlAkarszkonvertálni amibőlAkarszkonvertálni);
    }


    public static void main(String[] args) {

        //Konvertáló<String , Boolean> stringToBooleanKonvertáló = (bármilyenSzöveg) -> {return Boolean.parseBoolean(bármilyenSzöveg);};

        Konvertáló<String , Boolean> stringToBooleanKonvertáló =
                bármilyenSzövegDeAzEredménynekMárBooleannakKellLennie -> Boolean.parseBoolean(bármilyenSzövegDeAzEredménynekMárBooleannakKellLennie);

        Konvertáló<String, Boolean> str2BooleanKonvertalo = Boolean::parseBoolean;

        //false:
        out.println(stringToBooleanKonvertáló.metódusElnevezéseAmitHasználniAkarsz("Igaz"));

        out.println(str2BooleanKonvertalo.metódusElnevezéseAmitHasználniAkarsz("Yes"));
        out.println(str2BooleanKonvertalo.metódusElnevezéseAmitHasználniAkarsz("truee"));

        //true:
        out.println(stringToBooleanKonvertáló.metódusElnevezéseAmitHasználniAkarsz("true"));

        out.println(str2BooleanKonvertalo.metódusElnevezéseAmitHasználniAkarsz("True"));
        out.println(str2BooleanKonvertalo.metódusElnevezéseAmitHasználniAkarsz("tRuE"));

        Konvertáló<String, Boolean> stringToAnotherBoolean = egyszerűDeNagyszerű -> egyszerűDeNagyszerű.startsWith("I");
        Konvertáló<String, Boolean> stringToYetAnotherBooleanToCheckIfItIsBlank = String::isBlank;

        out.println(stringToAnotherBoolean.metódusElnevezéseAmitHasználniAkarsz("Igaz"));
        out.println(stringToYetAnotherBooleanToCheckIfItIsBlank.metódusElnevezéseAmitHasználniAkarsz(" "));



    }

}
