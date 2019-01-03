package decorator;

public class ModernStyleist extends  Stylist{
    private  void ShowRole(){
        System.out.println("演员要拍摄现代剧");
    }
    private  void MakeUpForActor(){
        System.out.println("给演员换上西装领带");
    }

    public   void act(){
        ShowRole();
        MakeUpForActor();
        super.act();
    }
}

