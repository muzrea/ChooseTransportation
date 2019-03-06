package main;

/**
 * Created by 苏晓风 on 2019/3/6.
 */
public class Transportation implements Transport{
    public static int price;
    public Transportation(int price){
        this.price = price;
    }
    public int getPrice(int price){
        return this.price;
    }
    public Boolean compareTransportation(int money){
        return this.price == money;
    }
}
