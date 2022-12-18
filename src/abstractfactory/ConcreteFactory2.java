package abstractfactory;

public class ConcreteFactory2 implements AbstractFactory {

    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA2("Продукт А, созданный фабрикой 2");
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB2("Продукт B, созданный фабрикой 2");
    }
}
