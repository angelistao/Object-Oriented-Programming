package exercise_n6;

public class Developer extends Worker {
    private double extraHours;

    public void increaseSalary(){
        this.salary += (this.salary * extraHours);
    }

    public double getExtrahours() {
        return this.extraHours;
    }

    public void setExtrasHours(double extraHours) {
        this.extraHours = extraHours;
    }

    @Override
    public String toString() {
        return "Desenvolvedor [extras.=" + extraHours + ", nome=" + name + ", salary=" + salary + "]";
    }

    
}
