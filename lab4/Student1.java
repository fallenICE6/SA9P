package src.lab4;

public class Student1 {
    private String name; // имя студента
    private String lastname; // фамилия студента
    private String group; // группа студента
    private String email; // почта студента

    public Student1(String name, String lastname, String group, String email) {
        this.name = name;
        this.lastname = lastname;
        this.group = group;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getGroup() {
        return group;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return String.format("Имя: %s, Фамилия: %s, Группа: %s, Почта: %s", name, lastname, group, email);
    }
}
