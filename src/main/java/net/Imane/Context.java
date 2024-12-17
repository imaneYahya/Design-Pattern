package net.Imane;

public class Context {
private IStrategy strategy = new DefaultStrategy();


    public void effectuerOperation(){
        System.out.println("*******************");
        strategy.opperationStrategy();
        System.out.println("===================");

    }
    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }


}
