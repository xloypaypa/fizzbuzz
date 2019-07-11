package main;

public class Student extends Person {
    private int i;

    public Student(String s, int i) {
        super(s);
        this.i = i;
    }

    public String action() {
        String result = "";
        if (i % 3 == 0) {
            result += "Fizz";
        }
        if (i % 5 == 0) {
            result += "Buzz";
        }
        if (i % 7 == 0) {
            result = "Whizz";
        }
        if (result.isEmpty()) {
            result += i;
        }
        return result;
    }
}
