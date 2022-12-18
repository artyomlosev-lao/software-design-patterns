package visitor;

public class Client {

    public static void main(String[] args) {
        new ConcreteElementA().accept(new ConcreteVisitor());
        new ConcreteElementB().accept(new ConcreteVisitor());
    }
}
