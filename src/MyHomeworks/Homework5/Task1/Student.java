package MyHomeworks.Homework5.Task1;

public class Student {
    public int course, grade;
    public String name;

    public Student(int course, int grade, String name) {
        this.name = name;
        this.grade = grade;
        this.course = course;
    }

    public void showInfo() {
        System.out.println("Student: " + name + ", Grade: " + grade + ", Course: " + course);
    }
}