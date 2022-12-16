package templatemethod;

public abstract class DataMiner {

    public void mine() {
        openFile();
        extractDate();
        parseData();
        hookMethod();
        analyzeData();
        sendReport();
        closeFile();
    }

    public abstract void openFile();

    public abstract void extractDate();

    public abstract void parseData();

    public abstract void closeFile();

    public void hookMethod() {
    }

    public void analyzeData() {
        System.out.println("Анализ данных...");
        System.out.println("Анализ данных завершён");
    }

    public void sendReport() {
        System.out.println("Жалоба отправлена");
    }

}
