package introdate;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner scannerForEmployee = new Scanner(System.in);

        System.out.println("Név?");
        String myName = scannerForEmployee.nextLine();
        System.out.println("Születési év?");
        int myYear = scannerForEmployee.nextInt();
        String enterHandler = scannerForEmployee.nextLine();
        System.out.println("Születési hónap (számmal)?");
        int myMonth = scannerForEmployee.nextInt();
        enterHandler = scannerForEmployee.nextLine();
        System.out.println("Születési nap?");
        int myDay = scannerForEmployee.nextInt();
        enterHandler = scannerForEmployee.nextLine();

        Employee myEmployee = new Employee(myYear, myMonth, myDay, myName);

        System.out.println("Az alkalmazott neve: " + myEmployee.getName());
        System.out.println("Az alkalmazott születési ideje: " + myEmployee.getDateOfBirth());
        System.out.println("Az alkalmazott belépési ideje: " + myEmployee.getBeginEmployment());




    }
}
