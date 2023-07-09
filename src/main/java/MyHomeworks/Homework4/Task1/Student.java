package MyHomeworks.Homework4.Task1;

public class Student {
    int studentId, year, mathGrade, economyGrade, foreignLangGrade;
    String name, surname;

    public Student(int studentId, int year, int mathGrade, int economyGrade, int foreignLangGrade, String name, String surname) {
        this.studentId = studentId;
        this.year = year;
        this.mathGrade = mathGrade;
        this.economyGrade = economyGrade;
        this.foreignLangGrade = foreignLangGrade;
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double calculateAverageGrade() {
        return (mathGrade + economyGrade + foreignLangGrade) / 3.0;
    }
}