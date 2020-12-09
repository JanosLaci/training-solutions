package week07d03;


//Kristóf Bárczay  10:05 AM
//Junior/ Mid-level csoport mai feladat:
//A week07d03 csomagban hozz létre egy NumberList osztályt.
// Ennek legyen egy metódusa isIncreasing(List<Integer>)
// mely egy számokból álló listát vár paraméterül és megnézi,
// hogy a listában a számok növekvő sorrendben szerepelnek-e
// és ennek megfelelően igaz vagy hamis értékkel tér vissza.
// Speciális eset ha két egymást követő szám egyenlő,
// ez nem probléma a 1,2,3,3,3,5 számokat növekvőnek tekintjük. (edited)

import java.util.ArrayList;
import java.util.List;

public class NumberList {


    public boolean isIncreasing(List<Integer> inputList ){
        List<Integer> toBecomparedList = new ArrayList<>();
        toBecomparedList = List.copyOf(inputList);
        inputList.sort(null);

        for (int i = 0; i < toBecomparedList.size(); i++) {
            if (!toBecomparedList.get(i).equals(inputList.get(i))) return false;

        }
        return true;

    }



}
