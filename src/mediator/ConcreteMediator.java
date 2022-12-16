package mediator;

public class ConcreteMediator implements Mediator{

    private ComponentA componentA;
    private ComponentB componentB;
    private ComponentC componentC;
    private ComponentD componentD;

    @Override
    public void notify(Component component) {
        if (component == componentA) reactOnA();
        if (component == componentB) reactOnB();
        if (component == componentC) reactOnC();
        if (component == componentD) reactOnD();
    }

    public void registerComponent(Component component) {
        switch (component.getClass().getName()) {
            case "mediator.ComponentA":
                componentA = (ComponentA) component;
                componentA.setMediator(this);
                break;
            case "mediator.ComponentB":
                componentB = (ComponentB) component;
                componentB.setMediator(this);
                break;
            case "mediator.ComponentC":
                componentC = (ComponentC) component;
                componentC.setMediator(this);
                break;
            case "mediator.ComponentD":
                componentD = (ComponentD) component;
                componentD.setMediator(this);
                break;
        }
    }


    public void reactOnA() {
        System.out.println("Реакция reactOnA из класса ConcreteMediator на активность в классе ComponentA");
    }

    public void reactOnB() {
        System.out.println("Реакция reactOnB из класса ConcreteMediator на активность в классе ComponentB");
    }

    public void reactOnC() {
        System.out.println("Реакция reactOnC из класса ConcreteMediator на активность в классе ComponentC");
    }

    public void reactOnD() {
        System.out.println("Реакция reactOnD из класса ConcreteMediator на активность в классе ComponentD");
    }
}
