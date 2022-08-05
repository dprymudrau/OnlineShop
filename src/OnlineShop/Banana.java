package OnlineShop;

public class Banana extends FoodShopItems{
    protected Banana(String name, double price){
        super(name, price);
    }

    public double getPrice(){
        return this.price;
    }
    public String getName(){
        return this.name;
    }



}