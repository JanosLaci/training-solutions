package week16d01;

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

public class BitcoinHindsight {

    List<Integer> getTwoDayIndexesWithMaxProfit(List<Double> inputBitcoinPriceList) {

        List<Integer> twoIndexesWithMaxProfit = new ArrayList<>();
        double lowestPrice = Collections.min(inputBitcoinPriceList);
        double highestPrice = Collections.max(inputBitcoinPriceList);

        int dayToBuy = inputBitcoinPriceList.indexOf(lowestPrice);
        int dayToSell = inputBitcoinPriceList.indexOf(highestPrice);


        twoIndexesWithMaxProfit.add(dayToBuy);
        twoIndexesWithMaxProfit.add(dayToSell);
        return twoIndexesWithMaxProfit;
    }

    public static void main(String[] args) {

        List<Double> bitcoinPricesFromFebruary2To8 = new ArrayList<>(List.of(
                35632.90195, 37397.42636, 37256.25211, 37851.59659, 40302.79979, 38461.6814, 39125.53826
        ));

        List<Integer> whatIShouldHaveDone = new BitcoinHindsight().getTwoDayIndexesWithMaxProfit(bitcoinPricesFromFebruary2To8);

        System.out.println("A vétel napjának az indexe a listában:\n"
                            + whatIShouldHaveDone.get(0)
                            + "\naz eladás napjának az indexe:\n"
                            + whatIShouldHaveDone.get(1));



    }
}
