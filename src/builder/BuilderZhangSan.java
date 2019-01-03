package builder;

/**
 * 张三
 */
public class BuilderZhangSan extends Builder {
    private  Product product=new Product();
    @Override
    public void BuilderPartA() {
        product.addParts("Parts A");
    }

    @Override
    public void BuilderPartB() {
        product.addParts("Parts B");
    }

    @Override
    public Product GetResult() {
        return product;
    }
}
