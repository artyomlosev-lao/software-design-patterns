package builder;

public class ConcreteBuilder2 implements Builder {

    private Product2 result;

    @Override
    public void reset() {
        result = new Product2();
    }

    @Override
    public Builder buildStepA() {
        result.setFeatureA("Особенность А для Product2");
        return this;
    }

    @Override
    public Builder buildStepB() {
        result.setFeatureB("Особенность B для Product2");
        return this;
    }

    @Override
    public Builder buildStepZ() {
        result.setFeatureZ("Особенность Z для Product2");
        return this;
    }

    public Product2 getResult() {
        return result;
    }
}
