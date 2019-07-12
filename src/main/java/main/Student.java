package main;

public class Student extends Person {
    private int i;

    public Student(String name, int i) {
        super(name);
        this.i = i;
    }

    public String number() {
        String result = "";
        if (i % 3 == 0) {
            result = "Fizz";
        }
        if (i % 5 == 0) {
            result = "Buzz";
        }
        if (i % 7 == 0) {
            result = "Whizz";
        }
        if (i % 15 == 0) {
            result = "FizzBuzz";
        }
        if (result.isEmpty()) {
            result += i;
        }
        return result;
    }
}
