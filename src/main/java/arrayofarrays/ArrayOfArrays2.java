package arrayofarrays;

import java.util.Scanner ;

public class ArrayOfArrays2 {
    public int[][] multiplicationTable(int size){
        int[][] sizedMultiplicationTable = new int[size][size];
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                sizedMultiplicationTable[i][j] = (i+1)*(j+1);
            }

        }
        return sizedMultiplicationTable;

    }

    public void printArrayOfArrays(int[][] a){


        for (int column = 0; column < a.length; column++){
            System.out.println();

            for (int row = 0; row < a[row].length; row++) {
                System.out.print(a[row][column] + " ");
            }
        }
    }

    public static void main(String[] args) {

        ArrayOfArraysMain myArraysOfArray = new ArrayOfArraysMain();
        System.out.println("Szorzótábla mérete?");
        Scanner scannerForArrayOfArrays = new Scanner(System.in);
        int mySize = scannerForArrayOfArrays.nextInt();

        int[][] returnedArray = myArraysOfArray.multiplicationTable(mySize);
        myArraysOfArray.printArrayOfArrays(returnedArray);
    }



}
