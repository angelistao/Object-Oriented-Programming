package Exercicio12;
import java.util.ArrayList;
import java.util.Comparator;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    

    @Override
    public String toString() {
        return "Livro [titulo=" + titulo + ", autor=" + autor + ", anoPublicacao=" + anoPublicacao + "]";
    }

    public static void main(String[] args) {
        ArrayList<Livro> livros = new ArrayList<Livro>();

        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        Livro livro2 = new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", 1997);
        Livro livro3 = new Livro("Dom Quixote", "Miguel de Cervantes", 1605);
        Livro livro4 = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943);
        Livro livro5 = new Livro("1984", "George Orwell", 1949);
        Livro livro6 = new Livro("A Revolução dos Bichos", "George Orwell", 1945);

        livros.add(livro1);
        livros.add(livro2);
        livros.add(livro3);
        livros.add(livro4);
        livros.add(livro5);
        livros.add(livro6);

        livros.sort(Comparator.comparing(Livro::getAnoPublicacao).reversed()); // reversed para ordenar do mais antigo ao mais novo

        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }
}
