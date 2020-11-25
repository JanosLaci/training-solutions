package localvariables;


import java.util.Scanner;

public class DistanceMain {

    public static void main(String[] args) {
        Scanner scannerForDistance = new Scanner(System.in);

        System.out.println("Távolság?");
        double distanceDouble = scannerForDistance.nextDouble();
        String enterHandling = scannerForDistance.nextLine();

        System.out.println("Pontos? (true/false?");

        boolean exactBoolean = scannerForDistance.nextBoolean();

        Distance myDistance = new Distance(distanceDouble,exactBoolean);

        System.out.println(myDistance.isExact());

        int cutAfterDecimalPoint = (int) distanceDouble;

        System.out.println("A távolság egész része: " + cutAfterDecimalPoint);

    }


}
