package week10d01;


//Mai junior és mid-level feladat: (edited)
//9:09
//Túrázás közben egy GPS eszköz rögzíti a pontokat. Eltárolja a GPS koordinátákat, valamint a magasságot (mindegyik lebegőpontos érték).
//Írj a week10d01.Hiking osztályba egy getPlusElevation() metódust, mely megkapja a magasságok listáját, és visszaadja
//a emelkedések összegét. Azaz pl. 10,20,15,18 esetén 13, ugyanis (20 - 10) + (18 - 15). A 20 méterről 15 méterre ereszkedést nem számolja bele,
//hiszen az ereszkedés, és nem emelkedés. (edited)

import java.util.List;

public class HikingFile {


    public double getPlusElevation(List<Double> inputList){
        double sumOfElevations = 0;

        for (int i = 1; i < inputList.size(); i++){


            if (inputList.get(i-1) < inputList.get(i)){
                sumOfElevations = sumOfElevations + inputList.get(i) - inputList.get(i-1);


            }


        }

        return sumOfElevations;

    }


}
