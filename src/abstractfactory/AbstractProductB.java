package abstractfactory;

public abstract class AbstractProductB {

    String description;

    public AbstractProductB(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + " - " + description;
    }
}
