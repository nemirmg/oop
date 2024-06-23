package hw5.view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import hw5.controller.StudentController;
import hw5.controller.StudyGroupController;
import hw5.model.StudyGroup;
import hw5.model.db.DataBase;
import hw5.model.impl.Student;
import hw5.model.impl.Teacher;

public class StudyGroupView {
    private StudentController studentController = new StudentController();
    private StudyGroupController studyGroupController = new StudyGroupController();

    public void start() {
        DataBase.fillDB();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1 - создать студента");
            System.out.println("2 - найти студента по id");
            System.out.println("3 - распечатать информацию обо всех студентах");
            System.out.println("4 - создать преподавателя");
            System.out.println("5 - создать учебную группу");
            System.out.println("0 - завершение программы");
            
            int choice = scanner.nextInt();
            switch (choice) {
                case 0 -> System.exit(0);
                case 1 -> createStudent();
                case 2 -> getById();
                case 3 -> getAllStudents();
                case 4 -> createTeacher();
                case 5 -> createStudyGroup();
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
        // scanner.close();

        Student student = studentController.createStudent(firstName, lastName, groupId);
        System.out.println(student);
        return student;
    }

    private Student getById() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите id пользователя:");
        int id = scanner.nextInt();
        // scanner.close();

        Student student = studentController.getById(id);
        System.out.println(student);
        return student;
    }

    private List<Student> getAllStudents() {
        List<Student> students = studentController.getAllStudents();
        System.out.println(students);
        return students;
    }

    private Teacher createTeacher() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя:");
        String firstName = scanner.nextLine();
        System.out.println("Введите фамилию:");
        String lastName = scanner.nextLine();
        // scanner.close();

        Teacher teacher = studyGroupController.createTeacher(firstName, lastName);
        System.out.println(teacher);
        return teacher;
    }

    private StudyGroup createStudyGroup() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите id преподавателя:");
        int teacherId = scanner.nextInt();
        System.out.println("Сколько студентов будет в группе?");
        int n = scanner.nextInt();
        int[] studentsId = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Введите id студентa %d: ", i + 1);
            studentsId[i] = scanner.nextInt();
        }

        StudyGroup studyGroup = studyGroupController.createStudyGroup(teacherId, studentsId);
        System.out.println(studyGroup);
        return studyGroup;
    }
}
