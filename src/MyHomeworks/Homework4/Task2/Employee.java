package MyHomeworks.Homework4.Task2;

public class Employee {
    private int salary;
    public String surname;
    int employeeId;

    public Employee(int salary, String surname, int employeeId) {
        this.salary = salary;
        this.surname = surname;
        this.employeeId = employeeId;
    }

    public int getSalary() {
        return salary;
    }
}