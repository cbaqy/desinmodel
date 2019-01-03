package builder;

/**
 * 建造者李四
 */
public class BuilderLiSi extends Builder {
    private  Product product=new Product();
    @Override
    public void BuilderPartA() {
        product.addParts("Parts C");
    }

    @Override
    public void BuilderPartB() {
        product.addParts("Parts D");
    }

    @Override
    public Product GetResult() {
        return product;
    }
}
