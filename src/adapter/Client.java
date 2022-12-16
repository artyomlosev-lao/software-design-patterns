package adapter;

public class Client {

    public static void main(String[] args) {
        ClientInterface clientInterface = new Adapter();
        System.out.println(clientInterface.method("2001-09-11"));
    }
}
