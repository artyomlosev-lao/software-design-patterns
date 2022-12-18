package abstractfactory;

public class Client {

    private AbstractFactory abstractFactory;

    public Client(AbstractFactory abstractFactory) {
        this.abstractFactory = abstractFactory;
    }

    public void someOperation() {
        AbstractProductA a = abstractFactory.createProductA();
        AbstractProductB b = abstractFactory.createProductB();
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        new Client(new ConcreteFactory1()).someOperation();
        new Client(new ConcreteFactory2()).someOperation();
    }
}
