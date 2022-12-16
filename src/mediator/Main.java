package mediator;

public class Main {

    public static void main(String[] args) {
        ConcreteMediator concreteMediator = new ConcreteMediator();
        ComponentA componentA = new ComponentA();

        ComponentB componentB = new ComponentB();

        ComponentC componentC = new ComponentC();

        ComponentD componentD = new ComponentD();

        concreteMediator.registerComponent(componentA);
        concreteMediator.registerComponent(componentB);
        concreteMediator.registerComponent(componentC);
        concreteMediator.registerComponent(componentD);
        componentA.operationA();
        componentB.operationB();
        componentC.operationC();
        componentD.operationD();
    }
}
