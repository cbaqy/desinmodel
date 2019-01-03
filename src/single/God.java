package single;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 单列模式
 */
public class God {
    static Lock lock=new ReentrantLock();
    private static God god;
    public static God GetInstance(){   //还有种更简单的方法利用初始化就得到。 private static God god=new God();
        if(god == null){  //防止浪费性能
            lock.lock();   //枷锁，防止产生多个实例
            if(god== null){
                god=new God();
            }
            lock.unlock();
        }
        return god;
    }
    public  void godName(){
        System.out.println("God name is god");
    }
    public  void godWords(){
        System.out.println("The world need light");
    }
}
