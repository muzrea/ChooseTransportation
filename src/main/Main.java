package main;

/**
 * Created by 苏晓风 on 2019/3/6.
 */
public class Main {
    public static void main(String[] args){
        int money = 500;
        PatternChoose bus = new PatternChoose(new Transportation(300));
        boolean busChoice =  bus.transport(money);
        if(busChoice){
            System.out.println("小明可以乘坐大巴回去。");
        }
        PatternChoose train = new PatternChoose(new Transportation(400));
        boolean trainChoice = train.transport(money);
        if(trainChoice){
            System.out.println("小明可以乘坐火车回去。");
        }
        PatternChoose airplane = new PatternChoose(new Transportation(1000));
        boolean airplaneChoice = airplane.transport(money);
        if(airplaneChoice){
            System.out.println("小明可以乘坐飞机回去。");
        }
        PatternChoose car = new PatternChoose(new Transportation(500));
        boolean carChoice = car.transport(money);
        if(carChoice){
            System.out.println("小明可以自驾回去。");
        }
    }
}
