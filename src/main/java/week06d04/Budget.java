package week06d04;

//Adam Arold  12:55 PM Junior/Mid level csoport mai gyakorlati feladata:
// Készíts az week06d04 csomagban egy Budget osztályt, amely a konstruktorában Item példányokat vár listában (List).
// Az Item tartalmazza az alábbi attribútumokat: int price, int month, String name.
// A Budget osztály tárolja el egy attribútumban a konstruktorban megkapott items listát.
// Írjunk egy metódust, getItemsByMonth néven, mely egy hónapot vár (1-12) és visszaadja a kiadásainkat az adott hónapban!
// Bónusz feladat: ellenőrizzük a bemeneti paramétereket és írjunk tesztet!


import java.util.ArrayList;
import java.util.List;

public class Budget {

    List<Item> items = new ArrayList<>();


    public Budget(List<Item> items) {
        this.items = items;
    }

    public int getItemsByMonth(int monthToAggregate){
        int monthlyAggregator = 0;

        for (Item monthlyItem : items
             ) {
             if (monthlyItem.getMonth() == monthToAggregate){
                 monthlyAggregator = monthlyAggregator + monthlyItem.getPrice();

            }



        }
        return monthlyAggregator;

    }
}
