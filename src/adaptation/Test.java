package adaptation;

public class Test {
    public static void main(String[] args) {
        System.out.println("出国前的电压220V使用把笔记本");
        Adapter adapter=new Adapter220V();
        adapter.PowerSupply();
        System.out.println("东南亚的电压110V使用把笔记本");
        adapter=new Adapter110V();
        adapter.PowerSupply();
    }
}
