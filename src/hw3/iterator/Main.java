package hw3.iterator;

import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Comparator;
import java.util.List;

// import comparator.StudentComparator;
import hw3.homework.Stream;
import hw3.homework.StreamService;
// import hw.StreamComparator;

// import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        StudentGroup studentGroup = new StudentGroup();
        Student st1 = new Student("Иван", 4);
        Student st2 = new Student("Игорь", 1);
        Student st3 = new Student("Алексей", 2);
        Student st4 = new Student("Юл", 3);
        studentGroup.addStudent(st1);
        studentGroup.addStudent(st2);
        studentGroup.addStudent(st3);
        studentGroup.addStudent(st4);

        /*
        // Iterator<Student> iterator = new StudentGroupIterator(studentGroup);

        // while (iterator.hasNext()) {
        //     System.out.println("Студент:" + iterator.next());
        // }

        for (Student student : studentGroup) {
            System.out.println(student);
        }
        System.out.println();
        
        ArrayList<Student> arrayList = new ArrayList<>(List.of(st1, st2, st3,st4));
        
        System.out.println("Изначальный список:\n" + arrayList + "\n");
        Collections.sort(arrayList);
        System.out.println("По возврастанию:\n" + arrayList + "\n");
        Collections.sort(arrayList, Comparator.reverseOrder());
        System.out.println("По убыванию:\n" + arrayList + "\n");
        
        // Collections.sort(arrayList, new StudentComparator());
        Collections.sort(arrayList, (s1, s2) -> s1.id - s2.id);
        System.out.println("По id:\n" + arrayList + "\n");
        */

        // Домашнее задание
        StudentGroup sg1 = new StudentGroup();
        sg1.addStudent(new Student("Анна", 11));
        sg1.addStudent(new Student("Виктория", 12));
        sg1.addStudent(new Student("Ольга", 13));
        
        StudentGroup sg2 = new StudentGroup();
        sg2.addStudent(new Student("Иннокентий", 21));
        sg2.addStudent(new Student("Ирина", 22));
        sg2.addStudent(new Student("Ян", 23));
        sg2.addStudent(new Student("Николай", 24));
        sg2.addStudent(new Student("Александра", 25));

        Stream s = new Stream();
        s.addGroup(studentGroup);
        s.addGroup(sg1);

        Stream s1 = new Stream();
        s1.addGroup(sg2);

        List<Stream> listOfStreams = new ArrayList<>(List.of(s, s1));
        System.out.println("Изначальный список потоков:");
        System.out.println(listOfStreams);

        StreamService.sortStreams(listOfStreams);
        System.out.println("\nОтсортированнный список потоков:");
        System.out.println(listOfStreams);
    }
}
