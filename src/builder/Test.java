package builder;

/**
 * 建造者模式的测试
 */
public class Test {
    public static void main(String[] args) {
        Director director=new Director();
        Builder builderZhangSan=new BuilderZhangSan();
        Builder builderLiSi=new BuilderLiSi();

        director.construct(builderZhangSan);
        Product productOfZhangSan=builderZhangSan.GetResult();
        productOfZhangSan.show();

        director.construct(builderLiSi);
        Product productOfLiSi=builderLiSi.GetResult();
        productOfLiSi.show();

    }
}
