package decorator;
//装饰器模式
public class Test {
    public static void main(String[] args) {
        Actor actor=new Actor();
        ModernStyleist modernStyleist=new ModernStyleist();
        AncientStyleist ancientStyleist=new AncientStyleist();

        modernStyleist.makeUp(actor);
        modernStyleist.act();
        ancientStyleist.act();
        //ancientStyleist.makeUp(actor);
    }
}
