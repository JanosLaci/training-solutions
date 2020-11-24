package classstructureintegrate;

import java.util.Scanner;

public class Product {

    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    //getters (specified in UML):

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    //setters (good practice):


    public void setName(String name) {
        this.name = name;
    }


    public void setPrice(int price) {
        this.price = price;
    }


    public void increasePrice(int priceIncrease){

        price =  price + priceIncrease;
        System.out.println("A " + name + " termék új ára " + price + " Ft.");

    }

    public void decreasePrice(int priceDecrease){

        price = price - priceDecrease;
        System.out.println("A " + name + " termék új ára " + price + " Ft.");

    }

    public static void main(String[] args) {

        Scanner scannerForProduct = new Scanner(System.in);
        System.out.println("Termék neve?");
        String nameString = scannerForProduct.nextLine();
        System.out.println("Termék ára?");
        int priceInt = scannerForProduct.nextInt();
        //Enter handling
        String enterHandling = scannerForProduct.nextLine();

        Product myProduct = new Product(nameString, priceInt);

        System.out.println("Áremelés nagysága?");
        int userDefinedIncrease = scannerForProduct.nextInt();
        myProduct.increasePrice(userDefinedIncrease);

        //Enter handling
        enterHandling = scannerForProduct.nextLine();


        System.out.println("Árcsökkentés nagysága?");
        int userDefinedDecrease = scannerForProduct.nextInt();
        myProduct.decreasePrice(userDefinedDecrease);

        //Enter handling
        enterHandling = scannerForProduct.nextLine();

    }





}
