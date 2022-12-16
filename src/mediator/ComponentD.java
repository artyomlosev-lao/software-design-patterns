package mediator;

public class ComponentD extends Component {

    public void operationD() {
        System.out.println("Логика метода operationD из класса ComponentD");
        mediator.notify(this);
    }
}
