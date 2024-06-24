package dip1.model;

import java.util.ArrayList;
import java.util.Arrays;

public class ReportService {
    private Report report;
    private PrintOut reportPrint;

    public ReportService(Report report, PrintOut reportPrint) {
        this.report = report;
        this.reportPrint = reportPrint;
    }
    // calculate report data
    public void calculate(){
        report.items =  new ArrayList<ReportItem>();
        report.items.add(new ReportItem("First", (float)5));
        report.items.add(new ReportItem("Second", (float)6));
    }

    public void output(){
        reportPrint.output(report.items);
    }

    public void add(ReportItem... items) {
        this.report.items.addAll(Arrays.asList(items));
    }
}
