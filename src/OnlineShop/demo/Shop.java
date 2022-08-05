package OnlineShop.demo;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Category> categories = new ArrayList<Category>();

    public Shop() {}

    public Shop(List<Category> categories) {
        this.categories = categories;
    }

    public List<Category> getCategories() {
        return this.categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }
}
