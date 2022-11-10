package oops.objectClassDemos;

import java.util.Objects;

public class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // student1.equals(null);
    @Override
    public boolean equals(Object passedObject) {
        if (this == passedObject) return true;

        if (passedObject == null || getClass() != passedObject.getClass()) return false;


        Student student = (Student) passedObject;
        return id == student.id;
    }



    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
