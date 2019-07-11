package main;

public class Teacher extends Person {

    private Student[] students;

    public Teacher(String name, Student[] students) {
        super(name);
        this.students = students;
    }

    public void action() {
        for (Student student : students) {
            System.out.println(student.action());
        }
    }

}
