package attributes.bill;

public class BillMain {
    public static void main(String[] args) {

        Item myItem1 = new Item("Ütemtelen tétel", 10, 30);
        Item myItem2 = new Item("Ütemezett tétel", 1, 3);

        Bill myBill = new Bill();

        myBill.addItem(myItem1);
        myBill.addItem(myItem2);

        double myExpenses = myBill.calculateTotalPrice();
        System.out.println("Az összköltség = " + myExpenses);



    }
}
