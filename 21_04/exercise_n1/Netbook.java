package exercise_n1;
import java.util.Scanner;

public class Netbook extends Computer {
    public String showBrand(){
        return this.brand;
    }

    public static void main(String[] args) {
        String brand;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("insert the netbook's brand: ");
        brand = keyboard.nextLine();

        Netbook net = new Netbook();
        net.brand = brand;

        System.out.println("netbook brand: " + net.showBrand());

        keyboard.close();
    }
}
