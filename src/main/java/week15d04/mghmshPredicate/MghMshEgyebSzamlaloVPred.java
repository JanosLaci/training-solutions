package week15d04.mghmshPredicate;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class MghMshEgyebSzamlaloVPred {

    static final String STRING_TO_BE_FILTERED = " ";

    static Predicate<String> isItVowel = "aoóuúöőüűáeéiíAOÓUÚÖŐÜŰÁEÉIÍ"::contains;
    static Predicate<String> isItConsonant = "ptkbdgfvzshjclrmnPTKBDGFVZSHJCLRMN"::contains;
    static Predicate<String> isItOther = (isItConsonant.or(isItVowel)).negate();
    static Predicate<String> isItToBeFiltered = STRING_TO_BE_FILTERED::equals;

   static Stream<String> olvasdBeKarakterStreambeSpaceNelkul(Path path) {

       try { return Files.lines(path)
               .flatMap(Pattern.compile("")::splitAsStream)
               .filter(isItToBeFiltered.negate()::test); }

        catch (IOException ioException) { throw new IllegalStateException("Cannot read the file.", ioException); }
    }

    public static void main(String[] args) throws IOException {

        Path path = Path.of("src/main/resources/week15d04/szovegfile.txt");
        Stream<String> karakterStream;

        karakterStream = olvasdBeKarakterStreambeSpaceNelkul(path);

        long maganhangzokSzama = karakterStream.filter(isItVowel).count();

        karakterStream = olvasdBeKarakterStreambeSpaceNelkul(path);

        long massalhangzokSzama = karakterStream.filter(isItConsonant).count();

        karakterStream = olvasdBeKarakterStreambeSpaceNelkul(path);

        long egyebSzama = karakterStream.filter(isItOther).count();

        karakterStream = olvasdBeKarakterStreambeSpaceNelkul(path);

        Map<Boolean, List<String>> particionaltMshMap
                = karakterStream.collect(Collectors.partitioningBy(isItConsonant));



        System.out.println("A magánhangzó egybetűs karakterek száma: " + maganhangzokSzama);
        System.out.println("A mássalhangzó egybetűs karakterek száma: " + massalhangzokSzama);
        System.out.println("Az egyéb karakterek száma space nélkül : " + egyebSzama);
        System.out.println("A talált karakterek felosztása aszerint, " +
                "hogy mássalhangzónak minősülnek-e:\n" + particionaltMshMap);
        System.out.println("A talált mássalhangzó karakterek listája:\n" + particionaltMshMap.get(true));

    }

}
