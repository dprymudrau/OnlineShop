package OnlineShop;

public class TShirt extends ClothingShopItems{
    protected TShirt(String name, double price){
        super(name, price);
    }

    public double getPrice(){
        return this.price;
    }
    public String getName(){
        return this.name;
    }



}