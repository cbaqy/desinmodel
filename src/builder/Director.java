package builder;

/**
 * 指挥者
 */
public class Director {
    public  void construct(Builder builder){
        builder.BuilderPartA();
        builder.BuilderPartB();
    }
}
