package simpleFactory;

/**
 * 简单工厂模式的测试
 */
public class Test {
    public static void main(String[] args) {
        //常规方法
        Ifactory factory=new Apple7Factory();
        Apple apple=factory.getApple();
        apple.getPhoneName();
        //反射得到工厂
        try{
            Class<?> c=Class.forName("simpleFactory.Apple7Factory"); //全路径
            try {
                Ifactory factory2=(Ifactory)c.newInstance();
                Apple apple2=factory2.getApple();
                apple2.getPhoneName();
            }catch (Exception e){}
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
