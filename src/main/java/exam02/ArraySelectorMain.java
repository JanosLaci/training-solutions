package exam02;

public class ArraySelectorMain {

    public static void main(String[] args) {


        int[] myArray = new int[]{1,2,3,4,5};

        ArraySelector myArraySelector = new ArraySelector();

        System.out.println(myArraySelector.selectEvens(myArray));
    }
}
