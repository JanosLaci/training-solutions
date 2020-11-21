package classstructureio;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {

        System.out.println("Kérem, írja be a regisztrációhoz használandó nevet!");
        Scanner enterRegistryData = new Scanner(System.in);

        String registeredName = enterRegistryData.nextLine();

        System.out.println("Kérem, írja be a regisztrációhoz használandó e-mail címet!");

        String registeredEmail= enterRegistryData.nextLine();


        System.out.println("Ön " + registeredName + " névvel és " + registeredEmail + " e-mail címmel regisztrált!");


    }

}
