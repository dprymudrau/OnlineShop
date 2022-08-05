package OnlineShop;

public class Tablet extends ElectronicShopItems{
    protected Tablet(String name, double price){
        super(name, price);
    }

    public double getPrice(){
        return this.price;
    }
    public String getName(){
        return this.name;
    }



}
