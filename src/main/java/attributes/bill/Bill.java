package attributes.bill;

import java.util.ArrayList;
import java.util.List;

public class Bill {
    List<Item> items = new ArrayList<>();

    public void addItem(Item itemToAdd){
        items.add(itemToAdd);

    }

    //{} mellőzése gyakorlásképp for ciklusban

    public double calculateTotalPrice(){
        double totalPrice = 0.0;
        for (Item itemToTotal : items) totalPrice += itemToTotal.getPrice() * itemToTotal.getQuantity();
        return totalPrice;

    }

    public List<Item> getItems() {
        return items;
    }
}
