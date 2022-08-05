package OnlineShop.demo;

import java.util.ArrayList;
import java.util.List;

public class Food extends Category {
    private List<Product> products = new ArrayList<Product>();

    public Food() {

    }

    public Food(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
