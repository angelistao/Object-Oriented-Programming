package exercise_n5;

public class Produto {
    private double preco;

    public double calcularPrecoFinal(double preco){
        setPreco(preco);
        return this.preco;
    }

    public double calcularPrecoFinal(Cliente cliente){
        this.preco = this.preco - cliente.getValorDescontoDoCliente();
        return this.preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public static void main(String[] args) {
        Produto produto = new Produto();
        Cliente c = new Cliente();
        c.setValorDescontoDoCliente(15);
        
        System.out.println("Preco do produto por calculo de valor: R$" + produto.calcularPrecoFinal(150));
        System.out.println("Preco do produto por desconto do cliente: R$" + produto.calcularPrecoFinal(c));
    }
}
