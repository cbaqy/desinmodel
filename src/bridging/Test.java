package bridging;

/**
 * 桥接模式，当对象有不同的种类并且有交集的时候的处理。
 * 比如学生不同的学院选择不同的课程
 */
public class Test {
    public static void main(String[] args) {
        Departments db;
        db=new Computer();
        db.SetCourse(new MathAdvance());
        db.Select();

        db=new Mathematics();
        db.SetCourse(new MathAnalysis());
        db.Select();
    }
}
