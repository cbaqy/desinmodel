package combination;

import java.util.ArrayList;
import java.util.List;
//实体部门类
public class ConcreteDepartment extends Department {
    private List<Department>  childrenList=new ArrayList<Department>();
    public  ConcreteDepartment(String name){
        super(name);
    }
    public void Add(Department department){
        childrenList.add(department);
    }
    public void Remove(Department department){
        childrenList.remove(department);
    }

    @Override
    public void ReportWork() {
        for (int i = 0; i < childrenList.size(); i++) {
            ((Department)childrenList.get(i)).ReportWork();
        }
    }

    @Override
    public void Show(int depath) {
        for (int i = 0; i <depath ; i++) {
            System.out.print("+");
        }
        System.out.println(name);
        for (int i = 0; i < childrenList.size(); i++) {
            ((Department)childrenList.get(i)).Show(depath +2);
        }
    }
}
