package mediator;

public class ComponentB extends Component {

    public void operationB() {
        System.out.println("Логика метода operationB из класса ComponentB");
        mediator.notify(this);
    }
}
