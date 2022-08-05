package OnlineShop;

public class Orange extends FoodShopItems{
    protected Orange(String name, double price){
        super(name, price);
    }

    public double getPrice(){
        return this.price;
    }
    public String getName(){
        return this.name;
    }



}