package builder;

public class Client {

    public static void main(String[] args) {
        ConcreteBuilder1 b1 = new ConcreteBuilder1();
        Director d = new Director(b1);
        d.make("simple");
        Product1 p1 = b1.getResult();

        ConcreteBuilder2 b2 = new ConcreteBuilder2();
        d.changeBuilder(b2);
        d.make("hard");
        Product2 p2_1 = b2.getResult();

        b2.reset();
        d.make("simple");
        Product2 p2_2 = b2.getResult();

        System.out.println(p1);
        System.out.println(p2_1);
        System.out.println(p2_2);
    }
}
