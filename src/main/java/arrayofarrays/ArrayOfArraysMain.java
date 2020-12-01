package arrayofarrays;


//Hozz létre egy int[][] multiplicationTable(int size) metódust,
// mely a paraméterként megadott méretű szorzótáblát adja vissza!
// A szorzótábla alakja (csak 4x4 esetén):
//1 2 3 4
//2 4 6 8
//3 6 9 12
//4 8 12 16

import java.util.Scanner;

public class ArrayOfArraysMain {

    public int[][] multiplicationTable(int size){
        int[][] sizedMultiplicationTable = new int[size][size];
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                sizedMultiplicationTable[i][j] = (i+1)*(j+1);
            }

        }
        return sizedMultiplicationTable;

    }

    public static void main(String[] args) {

        ArrayOfArraysMain myArraysOfArray = new ArrayOfArraysMain();
        System.out.println("Szorzótábla mérete?");
        Scanner scannerForArrayOfArrays = new Scanner(System.in);
        int mySize = scannerForArrayOfArrays.nextInt();

        int [][] returnedArray = myArraysOfArray.multiplicationTable(mySize);


        for (int column = 0; column < mySize; column++){
            System.out.println();

            for (int row = 0; row < mySize; row++) {
                System.out.print(returnedArray[row][column] + " ");
            }
        }




    }
}
