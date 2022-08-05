package OnlineShop;
//Online Shop, business q: client came to shop and order some goods, how much, how long shipping, ex: clothing or grocery
//20 classes, at least 5 should be abstract.
public class OnlineShop {
    protected String name;
    protected int inventory;

    OnlineShop(String name, int inventory){
        this.name = name;
        this.inventory = inventory;
    }
    protected String getName(){
        return this.name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    protected int getInventory(){
        return this.inventory;
    }
    //Unsure about how to utilize this properly
    public void decreaseInventory(){
        this.inventory--;
    }

}