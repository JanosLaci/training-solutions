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
import java.util.Collections;
import java.util.List;

public class NumberListV2 {

    public static boolean isIncreasingv2( List<Integer> inputList ){
        List<Integer> toBecomparedList = new ArrayList(inputList);
        Collections.sort(toBecomparedList);

        return inputList.equals(toBecomparedList);

    }
}
