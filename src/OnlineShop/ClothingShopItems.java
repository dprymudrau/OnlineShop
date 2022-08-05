package OnlineShop;
import java.util.ArrayList;

public abstract class ClothingShopItems {
    public static double cShopTotalPurchased = 0;
    public static ArrayList<String> cShopAllItems = new ArrayList<String>();

    protected String name;
    protected double price;

    ClothingShopItems(String name, double price){
        this.name = name;
        this.price = price;
    }
    public abstract double getPrice();
    public abstract String getName();

    protected void purchaseItem(){
        //Need to implement decrease inventory method
        cShopTotalPurchased += getPrice();
        cShopAllItems.add(getName());
        System.out.println("You purchased: " + getName() + " for " + getPrice() + " dollars.");
    }
    protected void purchaseMultipleOfItem(int num){
        //Need to implement decrease inventory method
        double multipleItemCost = getPrice() * num;
        cShopTotalPurchased += multipleItemCost;
        cShopAllItems.add(num + " " + getName() + "'s");
        System.out.println("You purchased : " + num + " " + getName() + "'s for " + multipleItemCost + " dollars.");
    }
    public static double getCShopTotalPurchased(){
        return cShopTotalPurchased;
    }
    public static ArrayList<String> getCShopAllItems(){
        return cShopAllItems;
    }
    public static void fShopPrintItems(){
        System.out.println("Clothing shop items purchased: " + cShopAllItems);
    }

    public static void fShopPrintTotalPurchase(){
        System.out.println("Clothing shop total purchase amount: $" + cShopTotalPurchased );
    }

}