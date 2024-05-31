package exercise_n1;
import java.util.Scanner;

public class Notebook extends Computer {
    public String showBrand(){
        return this.brand;
    }
    
    public static void main(String[] args) {
        String brand;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("insert the notebook's brand: ");
        brand = keyboard.nextLine();

        Notebook notebook = new Notebook();
        notebook.brand = brand;

        System.out.println("notebook's brand: " + notebook.showBrand());

        keyboard.close();
    }
}
