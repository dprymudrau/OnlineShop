package OnlineShop;

public class Pants extends ClothingShopItems{
    protected Pants(String name, double price){
        super(name, price);
    }

    public double getPrice(){
        return this.price;
    }
    public String getName(){
        return this.name;
    }



}