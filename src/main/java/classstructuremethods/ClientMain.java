package classstructuremethods;

public class ClientMain {

    public static void main(String[] args) {
        // testing the proper workings of Arabic characters and the patience of the Reader

        Client migrans = new Client();
        migrans.setName("هل طلبنا منكم أن تَسْقونا إِيّاهُما");
        migrans.setAddress("أحواز");
        migrans.setYear(1990);

        System.out.println("Az ügyfél neve: " + migrans.getName() + ", az ügyfél címe:" + migrans.getAddress() + ", az ügyfél születési éve:" + migrans.getYear() + ".");
        System.out.println();

        migrans.migrate("Pußtaborzaßtó");

        // the Arabic text is printed from right to left, introducing an unexpected problem
        // (IDE warning: Visual layout of bidirectional text can depend on base direction (set in View menu)

        System.out.println(migrans.getName() + "nevű ügyfél új címe: " + migrans.getAddress() + ".");
        System.out.println();

        // A clever fix may be to start with a Hungarian "A " character to force left-to-right printing:

        System.out.println("A " + migrans.getName() + "nevű ügyfél új címe: " + migrans.getAddress() + ".");

    }

}
