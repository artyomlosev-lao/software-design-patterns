package templatemethod;

public class Main {

    public static void main(String[] args) {
        DataMiner pdfDataMiner = new PDFDataMiner();
        DataMiner excelDataMiner = new ExcelDataMiner();

        pdfDataMiner.mine();
        System.out.println("\n==========================\n");
        excelDataMiner.mine();
    }
}
