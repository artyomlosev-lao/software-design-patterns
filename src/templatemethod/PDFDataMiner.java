package templatemethod;

public class PDFDataMiner extends DataMiner{

    @Override
    public void openFile() {
        System.out.println("Открыт файл в формате PDF");
    }

    @Override
    public void extractDate() {
        System.out.println("Извлечении данных из PDF файла...");
        System.out.println("Данные извлечены");
    }

    @Override
    public void parseData() {
        System.out.println("Парсинг текста для анализа...");
        System.out.println("Парсинг завершён");
    }

    @Override
    public void closeFile() {
        System.out.println("Открыт файл в формате PDF");
    }
}
