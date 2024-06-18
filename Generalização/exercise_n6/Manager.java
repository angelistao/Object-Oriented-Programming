package exercise_n6;

public class Manager extends Worker {
    private double anualBonus;

    public void increaseSalary(){
        this.salary += (this.salary * anualBonus);
    }

    public double getAnualBonus() {
        return anualBonus;
    }

    public void setAnualBonus(double anualBonus) {
        this.anualBonus = anualBonus;
    }

    @Override
    public String toString() {
        return "Manager [bonusAnual=" + anualBonus + ", nome=" + name + ", salario=" + salary + "]";
    }

    

    
    
}
