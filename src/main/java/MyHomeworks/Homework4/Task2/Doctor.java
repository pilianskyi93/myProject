package MyHomeworks.Homework4.Task2;

public class Doctor {
    private static Employee doctor = new Employee(2000, "Komarovskyi", 100);


    public static void main(String[] args) {
        System.out.println("Employee details:");
        System.out.println("Salary: " + doctor.getSalary());
        System.out.println("Employee: " + doctor.surname);
        System.out.println("Employee ID: " + doctor.employeeId);
    }
}