package exercise_n6;
import java.util.ArrayList;

public class Worker {
    protected String name;
    protected double salary;

    public void increaseSalary(){
        this.salary += (this.salary * 10);
    }

    public void increaseSalary(double percentual){
        this.salary += (this.salary * percentual);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Worker [name=" + name + ", salary=" + salary + "]";
    }

    public static void main(String[] args) {

        ArrayList<Worker> funcList = new ArrayList<Worker>();

        Manager w1 = new Manager();
        w1.setName("João");
        w1.setSalary(0);
        w1.setAnualBonus(0.1);

        funcList.add(w1);
        
        Developer f2 = new Developer();
        f2.setName("Maria");
        f2.setSalary(2000);
        f2.setExtrasHours(0.2);
        funcList.add(f2);

        Developer f3 = new Developer();
        f3.setName("José");
        f3.setSalary(3000);
        f3.setExtrasHours(0.2);
        funcList.add(f3);

        System.out.println("Func list:");
        for (Worker funcionario : funcList) {
            System.out.println(funcionario);
        }

        System.out.println();
        System.out.println("Increasing salaries to all the member!!!");

        for (Worker worker : funcList) {
            worker.increaseSalary();
            System.out.println(worker);
        }
        

    }
}
