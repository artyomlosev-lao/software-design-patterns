package visitor;

public class ConcreteVisitor implements Visitor {

    @Override
    public void visit(ConcreteElementA e) {
        System.out.println("Выполнена логика метода visit из ConcreteVisitor для елемента ConcreteElementA");
    }

    @Override
    public void visit(ConcreteElementB e) {
        System.out.println("Выполнена логика метода visit из ConcreteVisitor для елемента ConcreteElementB");
    }
}
