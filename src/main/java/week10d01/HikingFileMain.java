package week10d01;

import java.util.ArrayList;
import java.util.List;

public class HikingFileMain {

    public static void main(String[] args) {

        List<Double> myHikingList = List.of(1.0,2.0,3.0,4.0,5.0,1.0);


        HikingFile myHiking = new HikingFile();

        double myElevation = myHiking.getPlusElevation(myHikingList);
        System.out.println(myElevation);


    }

}
