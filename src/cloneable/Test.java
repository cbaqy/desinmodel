package cloneable;

/**
 * 克隆模式的测试
 */
public class Test {
    public static void main(String[] args) {
        //直接复制这样的是引用，会引起改变
        Student student1=new Student();
        student1.setAge(1);
        student1.setName("chengbin");

        Student student2=student1;
        System.out.println(student2.getName());
        student1.setName("qiuyu");
        System.out.println(student2.getName());

        //利用fuzhicopy的是新的对象，这里还应注意深浅复制，如果StudentClone里面引用其他的类，copy的对象是copy
        //引用，要注意把其他的类也实现 cloneable
        StudentClone studentClone1=new StudentClone();
        studentClone1.setName("chengbin");
        StudentClone studentClone2=(StudentClone) studentClone1.Clone();
        System.out.println(studentClone2.getName());
        studentClone1.setName("qiuyu");
        System.out.println(studentClone2.getName());


    }
}
