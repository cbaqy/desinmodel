package builder;

/**
 * 建造者类
 */
public abstract class Builder { //
    public abstract  void BuilderPartA();
    public abstract  void BuilderPartB();

    public abstract  Product GetResult();
}
