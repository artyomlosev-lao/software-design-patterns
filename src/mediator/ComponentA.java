package mediator;

public class ComponentA extends Component{

    public void operationA() {
        System.out.println("Логика метода operationA из класса ComponentA");
        mediator.notify(this);
    }
}
