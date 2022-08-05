package OnlineShop.demo;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> productList = new ArrayList<Product>();

    public Cart(List<Product> productList) {
        this.productList = productList;
    }

    public Cart() {

    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void removeProduct(Product product) {
        // removal
    }

    public double getOverallPrice() {
        double price = 0.0;
        for(Product product: productList) {
            price = price + product.getPrice();
        }
        return price;
    }
}
