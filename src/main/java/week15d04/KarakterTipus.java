package week15d04;

import java.util.HashSet;
import java.util.Set;

public class KarakterTipus {


    public static Set<Character> massalhangzok = new HashSet<>(Set.of(
            'p', 't', 'k', 'b', 'd', 'g', 'f', 'v', 'z', 's',  'h', 'j', 'c', 'l', 'r', 'm', 'n',
            'P', 'T', 'K', 'B', 'D', 'G', 'F', 'V', 'Z', 'S',  'H', 'J', 'C', 'L', 'R', 'M', 'N'));

    public static Set<Character> maganhangzok = new HashSet<>(Set.of(
            'a', 'o', 'ó', 'u', 'ú', 'ö', 'ő', 'ü', 'ű', 'á', 'e', 'é', 'i', 'í',
            'A', 'O', 'Ó', 'U', 'Ú', 'Ö', 'Ő', 'Ü', 'Ű', 'Á', 'E', 'É', 'I', 'Í'));

    static final char KISZURENDO_SPACE = ' ';


    static String addMegAKarakterTipusat(char inputChar) {


        if (maganhangzok.contains(inputChar)) return "Maganhangzo";
        if (massalhangzok.contains(inputChar)) return "Massalhangzo";
        return "Egyeb";

    }

}
