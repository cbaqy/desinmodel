package adaptation;

public class Adapter110V extends PowerPortable110V implements  Adapter{
    NoteBook noteBook=new NoteBook();
    @Override
    public void PowerSupply() {
        super.PowerSupply();
        System.out.println("适配器转换！");
        noteBook.Work();
    }
}
