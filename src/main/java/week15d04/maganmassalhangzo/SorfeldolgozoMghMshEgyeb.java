package week15d04.maganmassalhangzo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SorfeldolgozoMghMshEgyeb {

    int maganhangzokSzama;
    int massalhangzokSzama;
    int egyebKarakterekSzama;

    public static Set<Character> maganhangzok = new HashSet<>(Set.of(
            'a', 'o', 'ó', 'u', 'ú', 'ö', 'ő', 'ü', 'ű', 'á', 'e', 'é', 'i', 'í',
            'A', 'O', 'Ó', 'U', 'Ú', 'Ö', 'Ő', 'Ü', 'Ű', 'Á', 'E', 'É', 'I', 'Í'));

    public static Set<Character> massalhangzok = new HashSet<>(Set.of(
            'p', 't', 'k', 'b', 'd', 'g', 'f', 'v', 'z', 's',  'h', 'j', 'c', 'l', 'r', 'm', 'n',
            'P', 'T', 'K', 'B', 'D', 'G', 'F', 'V', 'Z', 'S',  'H', 'J', 'C', 'L', 'R', 'M', 'N'));







    public SorfeldolgozoMghMshEgyeb(String[] inputStringTomb) {
        int mghSzamlalo = 0;
        int mshSzamlalo =0;
        int egyebSzamlalo =0;

        for ( String betu: inputStringTomb) {
            if ("aoóuúöőüűáeéiíAOÓUÚÖŐÜŰÁEÉIÍ".contains(betu)) mghSzamlalo++;
            else if ("ptkbdgfvzshjclrmnPTKBDGFVZSHJCLRMN".contains(betu)) mshSzamlalo++;
            else if(!betu.equals(" ")) egyebSzamlalo++;

        this.maganhangzokSzama = mghSzamlalo;
        this.massalhangzokSzama = mshSzamlalo;
        this.egyebKarakterekSzama = egyebSzamlalo;
        }
        }

    public int getMaganhangzokSzama() {
        return maganhangzokSzama;
    }

    public int getMassalhangzokSzama() {
        return massalhangzokSzama;
    }

    public int getEgyebKarakterekSzama() {
        return egyebKarakterekSzama;
    }

    static Stream<SorfeldolgozoMghMshEgyeb> olvasdBeASorokatSorFeldolgozoStreambe(Path path) {
        try {
            return Files.lines(path).map(line -> line.split(""))
                    .map(stringTomb -> new SorfeldolgozoMghMshEgyeb(stringTomb));
        } catch (IOException ioException) {
            throw new IllegalStateException("Cannot read the file.", ioException);
        }

    }

        public static void main(String[] args){

        Path path = Path.of("src/main/resources/week15d04/szovegfile.txt");

        Stream<SorfeldolgozoMghMshEgyeb> sorfeldolgozokStreamben;

        sorfeldolgozokStreamben = olvasdBeASorokatSorFeldolgozoStreambe(path);

        int talaltMghkSzama = sorfeldolgozokStreamben.collect(Collectors.summingInt(SorfeldolgozoMghMshEgyeb::getMaganhangzokSzama));

        sorfeldolgozokStreamben = olvasdBeASorokatSorFeldolgozoStreambe(path);

        int talaltMshkSzama = sorfeldolgozokStreamben.mapToInt(SorfeldolgozoMghMshEgyeb::getMassalhangzokSzama).sum();

        sorfeldolgozokStreamben = olvasdBeASorokatSorFeldolgozoStreambe(path);

        int talaltEgyebSzama = sorfeldolgozokStreamben.mapToInt(SorfeldolgozoMghMshEgyeb::getEgyebKarakterekSzama).sum();



            System.out.println("A magánhangzó egybetűs karakterek száma: " + talaltMghkSzama);
            System.out.println("A mássalhangzó egybetűs karakterek száma: " + talaltMshkSzama);
            System.out.println("Az egyéb karakterek száma space nélkül : " + talaltEgyebSzama);




        }



        //Tévút
        // for ( String betu: inputStringTomb) {
        //            if (maganhangzok.contains(betu)) mghSzamlalo++;
        //            else if (massalhangzok.contains(betu)) mshSzamlalo++;
        //            else egyebSzamlalo++;
//Ötlet
//Collections.frequency(Arrays.asList(...), X)
//Ötlet
//map a - mgh
    //Ötlet
    // static Map<String, Integer> categoryToCountsOfConsonantsVowelsOtherSpace(String[] inputStringArray){
    //        Map<String, Integer> outPutCategoryToCountsMap;


}
