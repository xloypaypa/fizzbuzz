package main;

import java.util.Arrays;
import java.util.List;

public class Teacher extends Person {

    private Student[] students;

    public Teacher(String name, Student[] students) {
        super(name);
        this.students = students;
    }

    public void number() {//number 作动词有报数的意思
        List<Student> students = Arrays.asList(this.students);
        students.forEach((student -> {
            System.out.println(student.number());
        }));
    }

}
