package simpleFactory;

/**
 * 简单工厂模式的测试
 */
public class Test {
    public static void main(String[] args) {
        //常规方法
        Ifactory factory=new AppleFactory();
        Apple apple=factory.getApple(7);
        apple.getPhoneName();
        //反射得到工厂
        try{
            Class<?> c=Class.forName("simpleFactory.AppleFactory"); //全路径
            try {
                Ifactory factory2=(Ifactory)c.newInstance();
                Apple apple2=factory2.getApple(8);
                apple2.getPhoneName();
            }catch (Exception e){}
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
