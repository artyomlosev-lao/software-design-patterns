package abstractfactory;

public class ConcreteFactory1 implements  AbstractFactory{

    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA1("Продукт А, созданный фабрикой 1");
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB1("Продукт B, созданный фабрикой 1");
    }
}
