package OnlineShop;

public class SmartPhone extends ElectronicShopItems{
    protected SmartPhone(String name, double price){
        super(name, price);
    }

    public double getPrice(){
        return this.price;
    }
    public String getName(){
        return this.name;
    }

}