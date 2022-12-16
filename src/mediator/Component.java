package mediator;

public abstract class Component {

    Mediator mediator;

    public void setMediator(Mediator m) {
        mediator = m;
    }
}
