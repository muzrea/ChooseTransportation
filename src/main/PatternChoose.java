package main;

/**
 * Created by 苏晓风 on 2019/3/6.
 */
public class PatternChoose {
    private Transport transport;
    public PatternChoose(Transport transport){
        this.transport= transport;
    }
    public Boolean transport(int money){
        return transport.compareTransportation(money);
    }
}
