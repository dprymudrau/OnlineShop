package OnlineShop;
import java.util.ArrayList;

public abstract class ElectronicShopItems {
    public static double eShopTotalPurchased = 0;
    public static ArrayList<String> eShopAllItems = new ArrayList<String>();

    protected String name;
    protected double price;

    ElectronicShopItems(String name, double price){
        this.name = name;
        this.price = price;
    }
    public abstract double getPrice();
    public abstract String getName();

    protected void purchaseItem(){
        //Need to implement decrease inventory method
        eShopTotalPurchased += getPrice();
        eShopAllItems.add(getName());
        System.out.println("You purchased: " + getName() + " for " + getPrice() + " dollars.");
    }

    protected void purchaseMultipleOfItem(int num){
        //Need to implement decrease inventory method
        double multipleItemCost = getPrice() * num;
        eShopTotalPurchased += multipleItemCost;
        eShopAllItems.add(num + " " + getName() + "'s");
        System.out.println("You purchased : " + num + " " + getName() + "'s for " + multipleItemCost + " dollars.");
    }
    public static double getEShopTotalPurchased(){
        return eShopTotalPurchased;
    }
    public static ArrayList<String> getEShopAllItems(){
        return eShopAllItems;
    }
    public static void eShopPrintItems(){
        System.out.println("Electronic shop items purchased: " + eShopAllItems);
    }

    public static void eShopPrintTotalPurchase(){
        System.out.println("Electronic shop total purchase amount: $" + eShopTotalPurchased );
    }

}

