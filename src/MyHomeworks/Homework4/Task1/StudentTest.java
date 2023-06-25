package MyHomeworks.Homework4.Task1;

public class StudentTest {
    public static void main(String[] args) {
        Student stud1 = new Student(2802, 4, 80, 75, 92, "Thomas", "Smith");
        Student stud2 = new Student(2610, 3, 65, 75, 80, "Carlos", "Himenes");
        Student stud3 = new Student(2889, 5, 95, 85, 100, "Phillip", "Jhonson");

        System.out.println("Thomas Smith (ID: " + stud1.studentId + " , Year: " + stud1.year + ") average grade: " + stud1.calculateAverageGrade());
        System.out.println("Carlos Himenes (ID: " + stud2.studentId + " , Year: " + stud2.year + ") average grade: " + stud2.calculateAverageGrade());
        System.out.println("Phillip Jhonson (ID: " + stud3.studentId + "  , Year: " + stud1.year + ") average grade: " + stud3.calculateAverageGrade());
    }
}