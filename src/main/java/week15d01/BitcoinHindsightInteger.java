package week15d01;

//Kristóf Bárczay  7:40 AM
//Mai Senior feladat
//Egy befektető cég szeretné megnézni, hogy az elmúlt időszakban mikor lett volna érdemes venni, illetve eladni Bitcoint.
// Készíts egy metódust, ami paraméterül várja a Bitcoin
// valahány napi árfolyamát időrendi sorrendben egy listában, dollárban. (Egész számok listája)
// A metódus visszatérési értéke két szám legyen,
// az első hogy hányadik napon lett volna érdemes venni, a második pedig, hogy melyik napon lett volna érdemes eladni.
// Mindezt úgy, hogy a legnagyobb nyereségünk legyen

//Feltételezés: dátum kezelésére nincs szükség, csak egy lista indexeinek visszaadása várt
//Feltételezés (tévút): eladhatunk nem a tulajdonunkban lévő bitcoint

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class BitcoinHindsightInteger {

    List<Integer> getTwoDayIndexesWithMaxProfitFromInts(List<Integer> inputBitcoinPriceList) {

        List<Integer> twoIndexesWithMaxProfitInt = new ArrayList<>();
        int lowestPrice = Collections.min(inputBitcoinPriceList);
        int highestPrice = Collections.max(inputBitcoinPriceList);

        int dayToBuy = inputBitcoinPriceList.indexOf(lowestPrice);
        int dayToSell = inputBitcoinPriceList.indexOf(highestPrice);


        twoIndexesWithMaxProfitInt.add(dayToBuy);
        twoIndexesWithMaxProfitInt.add(dayToSell);
        return twoIndexesWithMaxProfitInt;
    }

    public static void main(String[] args) {

        List<Integer> bitcoinPricesFromFebruary2To8 = new ArrayList<>(List.of(
                35632, 37397, 37256, 37851, 40302, 38461, 39125
        ));

        List<Integer> whatIShouldHaveDoneInt = new BitcoinHindsightInteger().getTwoDayIndexesWithMaxProfitFromInts(bitcoinPricesFromFebruary2To8);

        System.out.println("A vétel napjának az indexe a listában:\n"
                + whatIShouldHaveDoneInt.get(0)
                + "\naz eladás napjának az indexe:\n"
                + whatIShouldHaveDoneInt.get(1));



    }
}