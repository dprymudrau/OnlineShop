package OnlineShop.demo;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private List<String> wishList = new ArrayList<String>();

    public Customer(List<String> wishList) {
        this.wishList = wishList;
    }

    public Customer() {

    }

    public List<String> getWishList() {
        return wishList;
    }

    public void setWishList(List<String> wishList) {
        this.wishList = wishList;
    }

}
