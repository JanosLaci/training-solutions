package week07d03;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class NumberListV2Main {

    public static void main(String[] args) {

        List<Integer> myIntegerList = new ArrayList<>();
        myIntegerList.add(1);
        myIntegerList.add(2);
        myIntegerList.add(3);


        System.out.println(NumberListV2.isIncreasingv2(myIntegerList));

        myIntegerList.add(3);

        System.out.println(NumberListV2.isIncreasingv2(myIntegerList));

        myIntegerList.add(1);

        System.out.println(NumberListV2.isIncreasingv2(myIntegerList));


    }
}
