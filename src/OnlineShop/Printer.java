package OnlineShop;

public class Printer extends ElectronicShopItems{
    protected Printer(String name, double price){
        super(name, price);
    }

    public double getPrice(){
        return this.price;
    }
    public String getName(){
    return this.name;
    }



}
