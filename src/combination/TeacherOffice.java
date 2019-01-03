package combination;

public class TeacherOffice extends  Department {
    public TeacherOffice(String name){
        super(name);
    }

    @Override
    public void Add(Department department) {

    }

    @Override
    public void Remove(Department department) {

    }

    @Override
    public void ReportWork() {
        System.out.println(name +"汇报了教师工作");
    }

    @Override
    public void Show(int depath) {
        for (int i = 0; i < depath ; i++) {
            System.out.print("+");
        }
        System.out.println(name);
    }


}
