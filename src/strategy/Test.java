package strategy;

/**
* @description ：策略模式
 * 初看很像工厂模式，工厂模式主要返回的是对象一个结果。
 * 而策略模式侧重的是过程，而且方法的上线文可以插入内容
 *
 * 和建造者模式相似度更高，但是同样的建造者模式产出的是一个对象。
* @author      ：chenbin
* @date        ：2020/2/21 17:30
*/
public class Test {
    public static void main(String[] args) {
        System.out.println("小红：你星期天的安排是怎么样的？");
        System.out.println("小明：打算A");
        Context c=new Context(new StrategyA());
        c.operations();
        System.out.println("小明：打算B");
        c=new Context(new StrategyA());
        c.operations();
    }
}
