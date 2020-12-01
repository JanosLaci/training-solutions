package array.array;

import java.lang.reflect.Array;

public class ArrayHandlerMain {
    public static void main(String[] args) {

        int[] myIntArray = {1, 2, 3, 4, 5, 6};

        ArrayHandler myArrayHandler = new ArrayHandler();

        System.out.println(myArrayHandler.find(myIntArray, 2));
        System.out.println(myArrayHandler.contains(myIntArray,2));



    }


}
