package combination;

public class Test {
    public static void main(String[] args) {
        ConcreteDepartment root=new ConcreteDepartment("西南科技大学");
        root.Add(new StudentOffice("西南科技大学学生管理处"));
        root.Add(new TeacherOffice("西南科技大学教师管理处"));

        ConcreteDepartment dep1=new ConcreteDepartment("计算机学院");
        dep1.Add(new StudentOffice("计算机学院学生管理处"));
        dep1.Add(new TeacherOffice("计算机学院教师管理处"));

        ConcreteDepartment dep2=new ConcreteDepartment("外语学院");
        dep2.Add(new StudentOffice("外语学院学生管理处"));
        dep2.Add(new TeacherOffice("外语学院教师管理处"));

        ConcreteDepartment dep3=new ConcreteDepartment("生命科学学院");
        dep3.Add(new StudentOffice("生命科学学院学生管理处"));
        dep3.Add(new TeacherOffice("生命科学院教师管理处"));

        ConcreteDepartment dep4=new ConcreteDepartment("机械工程学院");
        dep4.Add(new StudentOffice("机械工程学院学生管理处"));
        dep4.Add(new TeacherOffice("机械工程学院教师管理处"));


        root.Add(dep1);
        root.Add(dep2);
        root.Add(dep3);
        root.Add(dep4);

        System.out.println("西南科技大学结构图：");
        root.Show(1);
        System.out.println("西南科技大学召开计算机学院工作汇报会议：：：：");
        dep1.ReportWork();
        System.out.println("西南科技大学召开全校工作汇报会议：：：：");
        root.ReportWork();

    }
}
