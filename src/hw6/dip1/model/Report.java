package dip1.model;

import java.util.List;

public class Report{
    protected List<ReportItem> items;	// report data

    public Report(List<ReportItem> items) {
        this.items = items;
    }
}
