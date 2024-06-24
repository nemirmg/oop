package homework.view;

import java.util.Scanner;

import homework.model.User;
import homework.service.PersisterService;
import homework.service.ReportService;
import homework.service.UserService;
import homework.service.SaverService;

public class UserView {
    private UserService userService = new UserService();

    public void start() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя пользователя:");
        String name = sc.nextLine();
        sc.close();
        User user = userService.createUser(name);

        ReportService report = new ReportService();
        report.report(user);
        SaverService persister = new PersisterService(user);
        persister.save();
    }
 
}
