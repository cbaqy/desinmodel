package bridging;

public abstract class Departments {
    protected  Math mathCourse;

    public void SetCourse(Math math) {
        mathCourse=math;
    }
    public abstract void  Select();
}
