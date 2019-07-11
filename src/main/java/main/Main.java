package main;

public class Main {

    public static void main(String[] args) {
        String name = "name";
        Student[] students = new Student[20];
        for (int i = 0; i < 20; i++) {
            students[i] = new Student(name, i + 1);
        }
        Teacher teacher = new Teacher(name, students);
        teacher.number();
    }

}
