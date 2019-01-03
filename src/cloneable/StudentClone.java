package cloneable;

public class StudentClone implements Cloneable {
    private  String name;
    private  String age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    protected  Object Clone(){
        try{
            return  super.clone();
        }catch (CloneNotSupportedException e){
          return  null;
        }
    }
}
