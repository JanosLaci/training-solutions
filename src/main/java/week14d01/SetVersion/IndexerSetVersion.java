package week14d01.SetVersion;

import java.util.*;

public class IndexerSetVersion {

    public Map<Character, List<String>> indexV2(List<String> names) {

        if (names.size() < 1) throw new IllegalArgumentException("Nincs név a listában!");

        Map<Character, List<String>> mapOfFirstCharactersV2 = new HashMap<>();
         Set<Character> firstCharactersSet = new HashSet<>();

        for (String name: names) {
            //a megadott nevek kezdőbetűi helyett a kezdő karakterekkel dolgozunk
            char firstChar = name.charAt(0);
            firstCharactersSet.add(firstChar);
        }

        for (Character characterInSet : firstCharactersSet) {
            List<String> namesListToAdd = new ArrayList<>();
            for (String name: names) {
                char firstChar = name.charAt(0);
                if (firstChar == characterInSet){
                    namesListToAdd.add(name);
                    mapOfFirstCharactersV2.put(firstChar, namesListToAdd);
            }
            }

        }
        return mapOfFirstCharactersV2;
    }

    public static void main(String[] args) {
        System.out.println(new IndexerSetVersion().indexV2(List.of("Béla", "Botond", "Cecil")));
    }




}
