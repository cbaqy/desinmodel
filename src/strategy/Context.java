package strategy;

public class Context {
    Strategy strategy;
    public  Context(Strategy  strategy){
        this.strategy=strategy;
    }
    public void operations() {
        System.out.print("上午");
        strategy.metod1();
        System.out.print("下午");
        strategy.metod2();
    }
}
