package decorator;

public class Stylist extends Actor{
    protected  Actor actor;
    public void  makeUp(Actor actor){
        this.actor=actor;
    }
    public void act(){
        if(null != actor){
            actor.act();
        }else {
            System.out.println("演员未到位");
        }
    }
}
