package bridging;

public class Computer extends  Departments {
    @Override
    public void Select() {
        System.out.println("计算机同学选课");
        ((Math ) mathCourse).Select();
    }
}
