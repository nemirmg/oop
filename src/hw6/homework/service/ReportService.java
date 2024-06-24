package homework.service;

import homework.model.User;

public class ReportService {
    public void report(User user){
        System.out.println("Report for user: " + user.getName());
    }
}
