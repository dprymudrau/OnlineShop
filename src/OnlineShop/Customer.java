package OnlineShop;

import java.util.ArrayList;

public class Customer {
    private static ArrayList<String> purchasedItems = new ArrayList<String>();
    public static double totalCost = 0;

    protected void getTotalCost(){
        totalCost += ElectronicShopItems.getEShopTotalPurchased() + FoodShopItems.getFShopTotalPurchased() + ClothingShopItems.getCShopTotalPurchased();

        System.out.println("Customer total cost: $" + totalCost);
        //return totalCost;
    }
    protected void getAllItems(){
        ArrayList<String> allElectronicItems = ElectronicShopItems.getEShopAllItems();
        ArrayList<String> allFoodItems = FoodShopItems.getFShopAllItems();
        ArrayList<String> allClothingItems = ClothingShopItems.getCShopAllItems();
        purchasedItems.addAll(allElectronicItems);
        purchasedItems.addAll(allFoodItems);
        purchasedItems.addAll(allClothingItems);

        System.out.println("Customer item purchased list: " + purchasedItems);
    }

}
