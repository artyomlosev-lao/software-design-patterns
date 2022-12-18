package abstractfactory;

public abstract class AbstractProductA {

    String description;

    public AbstractProductA(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + " - " + description;
    }
}
