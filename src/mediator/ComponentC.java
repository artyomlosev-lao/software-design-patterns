package mediator;

public class ComponentC extends Component {

    public void operationC() {
        System.out.println("Логика метода operationC из класса ComponentC");
        mediator.notify(this);
    }
}
