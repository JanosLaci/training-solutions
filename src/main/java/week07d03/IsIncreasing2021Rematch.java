package week07d03;

//Utólagos újbóli megoldás

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

public class IsIncreasing2021Rematch {

    static boolean isIncreasing(List<Integer> inputList){

        List<Integer> sortedList = new ArrayList<>(List.copyOf(inputList));
        Collections.sort(sortedList);

        return inputList.equals(sortedList);

    }

    public static void main(String[] args) {

        boolean novekvo1 = isIncreasing(List.of(1,2,3,3,3,5));
        boolean novekvo2 = isIncreasing(List.of(1,2,3,4,3,5));

        System.out.print(novekvo1 + " " + novekvo2);
    }


}
