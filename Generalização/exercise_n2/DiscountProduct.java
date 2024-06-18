package exercise_n2;

public class DiscountProduct extends Product {
    
    @Override
    public void Discount(){
        this.price = this.price * 0.9;
    }

    public static void main(String[] args) {
        DiscountProduct product = new DiscountProduct();
        product.price = 100;
        product.Discount();
        System.out.println("Preço com desconto: " + product.price);
    }
}
