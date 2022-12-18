package builder;

public class ConcreteBuilder1 implements Builder {

    private Product1 result;

    @Override
    public void reset() {
        result = new Product1();
    }

    @Override
    public Builder buildStepA() {
        result.setFeatureA("Особенность А для Product1");
        return this;
    }

    @Override
    public Builder buildStepB() {
        result.setFeatureB("Особенность B для Product1");
        return this;
    }

    @Override
    public Builder buildStepZ() {
        result.setFeatureZ("Особенность Z для Product1");
        return this;
    }

    public Product1 getResult() {
        return result;
    }
}
