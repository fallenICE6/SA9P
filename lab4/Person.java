package src.lab4;

import java.util.Objects;

public class Person {
    String name;
    Person(String name) { this.name = name; }
    public String toString() { return name; }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}

