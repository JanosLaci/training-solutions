package week14d01;

import java.util.Arrays;

public class IndexerMain {

    public static void main(String[] args) {

        System.out.println( "Ha az átadott névlista\n\"Ödönke\", \"Lujza\", \"Ábrahám\", \"Magdolna\", \"László\",\n" +
                "akkor a visszaadott Map: \n"
                + new Indexer().index(Arrays.asList("Ödönke", "Lujza", "Ábrahám", "Magdolna", "László")));
    }
}
