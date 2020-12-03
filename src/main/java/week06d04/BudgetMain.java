package week06d04;

import java.util.ArrayList;
import java.util.List;

public class BudgetMain {

    public static void main(String[] args) {

        Item myItem1 = new Item(1,11,"Audiobook");
        Item myItem2 = new Item(2,12,"Xms decoration");

        List<Item> myList = new ArrayList<>();

        myList.add(myItem1);
        myList.add(myItem2);

        Budget myBudget = new Budget(myList);

        System.out.println(myBudget.getItemsByMonth(11));



    }

}
