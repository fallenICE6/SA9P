package src.lab4;

import java.util.*;

public class journal {
    private static Map<String, Student1> studentsByName = new HashMap<>();
    private static Map<String, Student1> studentsByEmail = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command;
        System.out.println("Введите команду (Add_name, Add_email, List, Exit):");

        while (true) {
            command = scanner.nextLine().trim();

            if (command.equalsIgnoreCase("EXIT")) {
                break;
            }

            switch (command.toUpperCase()) {
                case "ADD_NAME":
                    addStudentByName(scanner);
                    break;
                case "ADD_EMAIL":
                    addStudentByEmail(scanner);
                    break;
                case "LIST":
                    listStudents();
                    break;
                default:
                    System.out.println("Неизвестная команда. Пожалуйста, введите Add_name, Add_email, List, Exit.");
            }
        }

        scanner.close();
        System.out.println("Все изменения сохранены.");
    }

    private static void addStudentByName(Scanner scanner) {
        System.out.print("Введите имя студента: ");
        String name = scanner.nextLine().trim();
        System.out.print("Введите фамилию студента: ");
        String lastname = scanner.nextLine().trim();
        System.out.print("Введите группу студента: ");
        String group = scanner.nextLine().trim();
        System.out.print("Введите почту студента: ");
        String email = scanner.nextLine().trim();

        Student1 student = new Student1(name, lastname, group, email);
        studentsByName.put(name.toLowerCase(), student);
        studentsByEmail.put(email.toLowerCase(), student);

        System.out.println("Студент успешно добавлен.");
    }

    private static void addStudentByEmail(Scanner scanner) {
        System.out.print("Введите почту студента: ");
        String email = scanner.nextLine().trim();

        if (studentsByEmail.containsKey(email.toLowerCase())) {
            Student1 student = studentsByEmail.get(email.toLowerCase());
            System.out.println("Студент найден: " + student);
            return;
        }

        System.out.print("Введите имя студента: ");
        String name = scanner.nextLine().trim();
        System.out.print("Введите фамилию студента: ");
        String lastname = scanner.nextLine().trim();
        System.out.print("Введите группу студента: ");
        String group = scanner.nextLine().trim();

        Student1 student = new Student1(name, lastname, group, email);
        studentsByName.put(name.toLowerCase(), student);
        studentsByEmail.put(email.toLowerCase(), student);

        System.out.println("Студент успешно добавлен.");
    }

    private static void listStudents() {
        if (studentsByName.isEmpty()) {
            System.out.println("Журнал пуст.");
            return;
        }

        List<Student1> studentList = new ArrayList<>(studentsByName.values());
        studentList.sort(Comparator.comparing(Student1::getName)); // Сортировка по имени по алфавиту

        System.out.println("Список студентов:");
        for (Student1 student : studentList) {
            System.out.println(student);
        }
    }
}
