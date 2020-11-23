package classstructureconstructors;

import java.util.Scanner;

public class StoreMain {

    public static void main(String[] args) {

        System.out.println("Mi tárolandó az első raktárban?");
        Scanner scannerForStore = new Scanner(System.in);
        String firstStoreProduct = scannerForStore.nextLine();

        Store myStore1 = new Store(firstStoreProduct);

        System.out.println("Tárolandó mennyiség?");
        int firstStoreToBeStored = scannerForStore.nextInt();

        myStore1.store(firstStoreToBeStored);
        System.out.println("A " + myStore1.getProduct() + " termékből " + myStore1.getStock() + " darab van az első raktárban.");

        System.out.println("Elszállítandó mennyiség?");
        int firstStoreToBeDispatched = scannerForStore.nextInt();

        myStore1.dispatch(firstStoreToBeDispatched);
        System.out.println("A " + myStore1.getProduct() + " termékből " + myStore1.getStock() + " darab van az első raktárban.");

        //handling the enter keystroke after reading the int parameter

        String enterHandling = scannerForStore.nextLine();

        //preparing the second Store

        System.out.println("Mi tárolandó a második raktárban?");

        String secondStoreProduct = scannerForStore.nextLine();



        Store myStore2 = new Store(secondStoreProduct);

        System.out.println("Tárolandó mennyiség?");
        int secondStoreToBeStored = scannerForStore.nextInt();

        myStore2.store(secondStoreToBeStored);
        System.out.println("A " + myStore2.getProduct() + " termékből " + myStore2.getStock() + " darab van a második raktárban.");

        System.out.println("Elszállítandó mennyiség?");
        int secondStoreToBeDispatched = scannerForStore.nextInt();

        myStore2.dispatch(secondStoreToBeDispatched);
        System.out.println("A " + myStore2.getProduct() + " termékből " + myStore2.getStock() + " darab van a második raktárban.");



    }
}
