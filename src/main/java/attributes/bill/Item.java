package attributes.bill;

//Legyen egy attributes.bill.Item osztály, melynek legyen String product, int quantity és egy double price attribútuma!
// Legyen konstruktor, valamint legyenek getter metódusok!
//Legyen egy Bill osztály, melynek legyen egy List<Item> items attribútuma!
// Legyen egy addItem(Item) metódus, és egy getter az items attribútumhoz!
//A Bill osztályban legyen egy calculateTotalPrice() metódus,
// mely végigmegy a számla tételein, beszorozza a quantity és price értékeket, és összeadja őket!
//Teszteld a BillMain main() metódusával!

public class Item {
     String product;
     int quantity;
     double price;

    public Item(String product, int quantity, double price) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}
