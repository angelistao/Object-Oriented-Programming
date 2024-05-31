package exercise_n3;

public class Worker {

    public void calculateSalary(int hoursWorked, double hourValue) {
        double salary = hoursWorked * hourValue;
        System.out.println("Salary: " + salary);
    }
}
