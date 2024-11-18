package src.lab4;

import java.util.*;
import java.util.stream.Collectors;

public class Student {
    private String name; //имя студента
    private String lastname; //фамилия студента
    private String group; //группа студента
    private Integer course; //курс студента
    private List<Integer> grades; //оценки по предметам

    //Конструктор
    public Student(String name, String lastname, String group, int course, List<Integer> grades) {
        this.name = name;
        this.lastname = lastname;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }
    // Getters and setters
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getLastname(){
        return lastname;
    }

    public void setLastname(String lastname){
        this.lastname = lastname;
    }

    public String getGroup(){
        return group;
    }

    public void setGroup(String group){
        this.group = group;
    }

    public Integer getCourse(){
        return course;
    }

    public void setCourse(Integer course){
        this.course = course;
    }
    public Integer UpCourse(){
       return course++;
    }
    public List<Integer> getGrades(){
        return grades;
    }

    public void setGrades(List<Integer> grades){
        this.grades = grades;
    }
    public double averageGrade() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }
    //union
    public static Set<Student> union(Set<Student> set1, Set<Student> set2) {
        HashSet<Student> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;
    }
    //intersect
    public static Set<Student> intersect(Set<Student> set1, Set<Student> set2) {
        HashSet<Student> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);
        return intersectionSet;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;
        Student other = (Student) obj;
        return name.equals(other.name) &&
                lastname.equals(other.lastname) &&
                group.equals(other.group) &&
                course.equals(other.course) &&
                grades.equals(other.grades);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname, group, course, grades);
    }
    public String toString(){
        return String.format("""
                
                ---------------------------------
                Имя студента: %s
                Фамилия студента: %s
                Группа: %s
                Курс: %d
                Оценки по предметам: %s
                ----------------------------------
                """, name, lastname, group, course, grades.stream().map(String::valueOf)
                .collect(Collectors.joining(",")));
    }
}
