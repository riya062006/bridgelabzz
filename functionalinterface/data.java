interface DataExporter {
    void exportToCSV();
    void exportToPDF();

    default void exportToJSON() {
        System.out.println("Exporting data to JSON format...");
    }
}

class ReportGenerator implements DataExporter {
    public void exportToCSV() { System.out.println("Exported to CSV."); }
    public void exportToPDF() { System.out.println("Exported to PDF."); }
}

public class data {
    public static void main(String[] args) {
        ReportGenerator report = new ReportGenerator();
        report.exportToCSV();
        report.exportToPDF();
        report.exportToJSON();
    }
}

