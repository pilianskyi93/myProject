package MyHomeworks.Homework5.Task1;

public class Student {
    private int course, grade;
    private String name;

      protected Student(int course, int grade, String name) {
        this.name = name;
        this.grade = grade;
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public int getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setName(String name) {
        this.name = name;
    }

     protected void showInfo() {
        System.out.println("Student: " + getName() + ", Grade: " + getGrade() + ", Course: " + getCourse());
    }
}