package exercise_n3;

public class Manager extends Worker {
    @Override
    public void calculateSalary(int hoursWorked, double hourValue) {
        double salary = hoursWorked * hourValue;
        salary = salary * 1.1;
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Manager manager = new Manager();
        System.out.println("Manager salary: ");
        manager.calculateSalary(40, 50);    
        
        System.out.println("Worker salary: ");
        Worker worker = new Worker();
        worker.calculateSalary(40, 50);
    }
}
