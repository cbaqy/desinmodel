package decorator;
/**
* @description ：装饰器模式
 * 感觉这个例子不是很形象，造型师只是造型，按理说最后都该是演员的动作
* @author      ：chenbin
* @date        ：2020/2/21 17:50
*/

public class Test {
    public static void main(String[] args) {
        Actor actor=new Actor();
        ModernStyleist modernStyleist=new ModernStyleist();
        AncientStyleist ancientStyleist=new AncientStyleist();

        modernStyleist.makeUp(actor);
        modernStyleist.act();
        ancientStyleist.makeUp(actor);
        ancientStyleist.act();
    }
}
