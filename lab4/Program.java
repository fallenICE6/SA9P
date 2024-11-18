package src.lab4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        String path = "C:\\Users\\Matve\\Desktop\\Сравнительный анализ языков программирования\\students.txt";
        ArrayList students = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length < 12) {
                    continue;
                }
                List grades = new ArrayList<>();
                for (int i = 4; i <= 11 ; i++) {
                    if(!parts[i].equals("."))
                    grades.add(Integer.parseInt(parts[i]));
                    else break;
                }
                Student student = new Student(parts[0].trim(), parts[1].trim(), parts[2].trim(), Integer.parseInt(parts[3]), grades);
                students.add(student);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Список студентов до изменений: " + students);
        int expelledCount = expel(students);
       System.out.println("Число отчисленных студентов: " + expelledCount);
      System.out.println("Список студентов после отчисления: " + students);
      int transfer = transfer(students);
       System.out.println("Число переведенных студентов: " + transfer);
        System.out.println("Список студентов после перевода: " + students);
       List<Student> courseStudents2 = getStudents(students, 2);
       System.out.println("Все студенты 2 курса: ");
        for (Student student : courseStudents2) {
            System.out.println(student.toString());
        }
        HashSet<Student> set1 = new HashSet<>();
        HashSet<Student> set2 = new HashSet<>();

        // Добавляем студентов для проверки union и intersect
        set1.add(new Student("Иван", "Иванов", "Пин-122", 1, Arrays.asList(5, 4, 3)));
        set1.add(new Student("Петр", "Петров", "Пин-122", 2, Arrays.asList(4, 4, 4)));
        set1.add(new Student("Анна", "Кузнецова", "Ис-122", 3, Arrays.asList(5, 5, 5)));
        set2.add(new Student("Мария", "Сидорова", "Ис-122", 1, Arrays.asList(5, 5, 4)));
        set2.add(new Student("Анна", "Кузнецова", "Ис-122", 3, Arrays.asList(5, 5, 5)));

        // Объединяем наборы
        Set<Student> unionSet = Student.union(set1, set2);
        System.out.println("Объединение наборов:");
        for (Student student : unionSet) {
            System.out.println(student);
        }

        // Находим пересечение наборов
        Set<Student> intersectSet = Student.intersect(set1, set2);
        System.out.println("Пересечение наборов:");
        for (Student student : intersectSet) {
            System.out.println(student);
        }
    }
//expel method
    public static int expel(List<Student> students) {
        List<Student> expelledStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.averageGrade() < 3.0) {
                expelledStudents.add(student);
            }
        }
        students.removeAll(expelledStudents);
        return expelledStudents.size();
    }
//transfer method
public static int transfer(List<Student> students) {
    int transferred = 0;
    List<Student> toRemove = new ArrayList<>();
    for (Student student : students) {
        if (student.averageGrade() >= 3) {
            student = new Student(student.getName(), student.getLastname(), student.getGroup(), student.UpCourse(), student.getGrades());
            toRemove.add(student);
            transferred++;
        }
        else{
            toRemove.add(student);
        }
    }
    students.removeAll(toRemove);
    return transferred;
}
//getStudents method
public static List<Student> getStudents(List<Student> students, int course) {
    List<Student> courseStudents = new ArrayList<>();
    for (Student student : students) {
        if (student.getCourse() == course) {
            courseStudents.add(student);
        }
    }
    return courseStudents;
}

}
