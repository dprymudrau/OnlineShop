package OnlineShop;

public class Hoodie extends ClothingShopItems{
    protected Hoodie(String name, double price){
        super(name, price);
    }

    public double getPrice(){
        return this.price;
    }
    public String getName(){
        return this.name;
    }



}