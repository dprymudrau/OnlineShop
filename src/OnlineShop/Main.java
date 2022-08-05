package OnlineShop;

public class Main {
    public static void main(String []args) {
        Customer customer = new Customer();
        //initializing Shops with name and inventory
        ElectronicShop es = new ElectronicShop("Electronic Shop", 50);
        FoodShop fs = new FoodShop("Food Shop", 100);

        //initializing items with name and price

        Printer hp = new Printer("HP-Printer", 100.99);
        Tablet tablet = new Tablet("iPad", 350.01);
        SmartPhone smartPhone = new SmartPhone("Galaxy s10", 999.99);
        Banana banana = new Banana("Banana", 1.50);
        Apple apple = new Apple("Apple", 2.25);
        Orange orange = new Orange("Orange", 0.99);
        TShirt tshirt = new TShirt("White T-Shirt", 8.99);
        Hoodie hoodie = new Hoodie("Purple Hoodie", 28.99);
        Pants pants = new Pants("Jeans", 31.99);


        //purchasing items
        hp.purchaseMultipleOfItem(5);
        tablet.purchaseItem();
        smartPhone.purchaseItem();
        banana.purchaseMultipleOfItem(12);
        apple.purchaseItem();
        orange.purchaseItem();
        tshirt.purchaseMultipleOfItem(3);
        hoodie.purchaseMultipleOfItem(2);
        pants.purchaseItem();


        //Testing or unused statements
        //System.out.println(es.getInventory());
        //ElectronicShopItems.eShopPrintItems();
        //ElectronicShopItems.eShopPrintTotalPurchase();

        //Printing and calculating total cost and printing created array of all purchased items
        customer.getTotalCost();
        customer.getAllItems();


    }
}
