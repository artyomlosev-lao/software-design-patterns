package builder;

public interface Builder {

    void reset();

    Builder buildStepA();

    Builder buildStepB();

    Builder buildStepZ();
}
