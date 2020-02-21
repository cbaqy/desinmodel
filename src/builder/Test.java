package builder;

/**
 * 建造者模式的测试
 * 侧重指挥的顺序作用，最后产出的是一个产出的对象
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
