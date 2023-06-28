package MyHomeworks.Homework5.Task1;

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student(4, 9, "Stepan");
        Student s2 = new Student(1, 8, "Maksym");
        Student s3 = new Student(3, 5, "Petro");
        Student s4 = new Student(2, 10, "Pavlo");

        s1.setCourse(2);
        s1.setGrade(3);
        s1.setName("Carl");

        s1.showInfo();
        s2.showInfo();
        s3.showInfo();
        s4.showInfo();

    }
}