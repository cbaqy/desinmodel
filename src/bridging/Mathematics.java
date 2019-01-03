package bridging;

public class Mathematics extends  Departments {
    @Override
    public void Select() {
        System.out.println("数学系选课");
        ((Math ) mathCourse).Select();
    }
}
