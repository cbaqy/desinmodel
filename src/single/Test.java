package single;

/**
 * 单例模式的测试
 */
public class Test {
    public static void main(String[] args) {
        God god1=God.GetInstance();
        god1.godName();
        God god2=God.GetInstance();
        god2.godWords();
        if(god1 == god2){
            System.out.println("God is onlyone");
        }
    }
}
