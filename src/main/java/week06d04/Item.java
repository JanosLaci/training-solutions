package week06d04;

public class Item {
    int price, month;
    String name;

    public Item(int price, int month, String name) {
        this.price = price;
        this.month = month;
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public int getMonth() {
        return month;
    }

    public String getName() {
        return name;
    }
}
