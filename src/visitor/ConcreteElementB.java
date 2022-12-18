package visitor;

public class ConcreteElementB implements Element {

    {
        featureB();
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public void featureB() {
        System.out.println("Создан объект класса ConcreteElementB");
    }
}
