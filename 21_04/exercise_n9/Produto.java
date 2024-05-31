package Exercicio9;
import java.util.ArrayList;

public class Produto {
    private String descricao;
    private double preco;
    private int quantidade;

    public Produto(String descricao, double preco, int quantidade){
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    

    @Override
    public String toString() {
        return "Produto [descricao=" + descricao + ", preco=" + preco + ", quantidade=" + quantidade + "]";
    }



    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<Produto>();

        produtos.add(new Produto("Camiseta", 50.0, 10));
        produtos.add(new Produto("Calça", 100.0, 5));
        produtos.add(new Produto("Tênis", 200.0, 3));
        

        for (Produto produto : produtos) {
            System.out.println(produto);
        }

        
    }

}
