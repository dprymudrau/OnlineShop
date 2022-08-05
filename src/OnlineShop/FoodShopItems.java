package OnlineShop;
import java.util.ArrayList;

public abstract class FoodShopItems {
    public static double fShopTotalPurchased = 0;
    public static ArrayList<String> fShopAllItems = new ArrayList<String>();

    protected String name;
    protected double price;

    FoodShopItems(String name, double price){
        this.name = name;
        this.price = price;
    }
    public abstract double getPrice();
    public abstract String getName();

    protected void purchaseItem(){
        //Need to implement decrease inventory method
        fShopTotalPurchased += getPrice();
        fShopAllItems.add(getName());
        System.out.println("You purchased: " + getName() + " for " + getPrice() + " dollars.");
    }

    protected void purchaseMultipleOfItem(int num){
        //Need to implement decrease inventory method
        double multipleItemCost = getPrice() * num;
        fShopTotalPurchased += multipleItemCost;
        fShopAllItems.add(num + " " + getName() + "'s");
        System.out.println("You purchased : " + num + " " + getName() + "'s for " + multipleItemCost + " dollars.");
    }
    public static double getFShopTotalPurchased(){
        return fShopTotalPurchased;
    }
    public static ArrayList<String> getFShopAllItems(){
        return fShopAllItems;
    }
    public static void fShopPrintItems(){
        System.out.println("Food shop items purchased: " + fShopAllItems);
    }

    public static void fShopPrintTotalPurchase(){
        System.out.println("Food shop total purchase amount: $" + fShopTotalPurchased );
    }

}
