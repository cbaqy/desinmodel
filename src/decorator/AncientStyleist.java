package decorator;

public class AncientStyleist extends  Stylist{
    private  void ShowRole(){
        System.out.println("演员要拍摄古装剧");
    }
    private  void MakeUpForActor(){
        System.out.println("给演员换上古装");
    }

    public   void act(){
        ShowRole();
        MakeUpForActor();
        super.act();
    }
}

