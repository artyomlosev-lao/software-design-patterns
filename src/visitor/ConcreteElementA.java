package visitor;

public class ConcreteElementA implements Element {

    {
        featureA();
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public void featureA() {
        System.out.println("Создан объект класса ConcreteElementA");
    }
}
