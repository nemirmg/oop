package hw5.view;

import java.util.List;
import java.util.Scanner;

import hw5.controller.StudentController;
import hw5.model.db.DataBase;
import hw5.model.impl.Student;

public class StudentView {
    private StudentController studentController = new StudentController();

    public void start() {
        DataBase.fillDB();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1 - создать студента");
            System.out.println("2 - найти студента по id");
            System.out.println("3 - распечатать информацию обо всех студентах");
            System.out.println("4 - завершение программы");
            
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> createStudent();
                case 2 -> getById();
                case 3 -> getAllStudents();
                case 4 -> System.exit(0);
                default -> System.out.println("Операция не поддерживается.");
            }
        }
    }
    
    private Student createStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя:");
        String firstName = scanner.nextLine();
        System.out.println("Введите фамилию:");
        String lastName = scanner.nextLine();
        System.out.println("Введите номер группы:");
        int groupId = scanner.nextInt();

        Student student = studentController.createStudent(firstName, lastName, groupId);
        System.out.println(student);
        return student;
    }

    private Student getById() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите id пользователя:");
        int id = scanner.nextInt();

        Student student = studentController.getById(id);
        System.out.println(student);
        return student;
    }

    private List<Student> getAllStudents() {
        List<Student> students = studentController.getAllStudents();
        System.out.println(students);
        return students;
    }
}
