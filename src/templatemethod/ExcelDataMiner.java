package templatemethod;

public class ExcelDataMiner extends DataMiner{

    @Override
    public void openFile() {
        System.out.println("Открыт файл в формате Excel");
    }

    @Override
    public void extractDate() {
        System.out.println("Извлечении данных из Excel файла...");
        System.out.println("Данные извлечены");
    }

    @Override
    public void parseData() {
        System.out.println("Парсинг Excel таблиц для анализа...");
        System.out.println("Парсинг завершён");
    }

    @Override
    public void closeFile() {
        System.out.println("Открыт файл в формате Excel");
    }

    public void hookMethod() {
        System.out.println("Сбор данных по Excel формулам для анализа...");
        System.out.println("Сбор данных завершён");
    }
}
