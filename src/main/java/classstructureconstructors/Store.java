package classstructureconstructors;

public class Store {
    private String product;
    private int stock;

    public Store(String product) {
        this.product = product;
    }


    public  void store(int quantity){
        stock = stock + quantity;

    }

    public  void dispatch(int quantity){
        stock = stock - quantity;

    }


    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
