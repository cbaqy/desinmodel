package simpleFactory;

public class Apple7Factory implements  Ifactory {
    @Override
    public Apple getApple() {
        return new Apple7();
    }
}
