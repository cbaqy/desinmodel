package simpleFactory;

public class AppleFactory implements  Ifactory {
    @Override
    public Apple getApple(int i) {
        Apple apple=null;
        switch (i){
            case 7:
                apple =  new Apple7();break;
            case 8:
                apple =  new Apple8();break;
            case 9:
                apple =  new Apple9();break;
             default:
                 break;
        }
        return  apple;
    }
}
