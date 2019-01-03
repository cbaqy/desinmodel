package combination;


//部门类
public abstract class Department {
        protected String name;
        public  Department(String name){
            this.name=name;
        }
        //增加部门
        public  abstract  void  Add(Department department);
        //移除部门
        public abstract void Remove(Department department);
        //显示部门结构
        public abstract void Show(int depath);
        //部门回报工作
         public abstract void ReportWork();
}
