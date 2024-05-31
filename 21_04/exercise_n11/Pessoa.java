package Exercicio11;
import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public Pessoa(String nome, int idade, String sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    

    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }



    public int getIdade() {
        return idade;
    }



    public void setIdade(int idade) {
        this.idade = idade;
    }



    public String getSexo() {
        return sexo;
    }



    public void setSexo(String sexo) {
        this.sexo = sexo;
    }



    public int quantidadeMulheres(ArrayList<Pessoa> pessoas){
        int quantidade = 0;
        for (Pessoa pessoa : pessoas) {
            if(pessoa.getSexo().equals("Feminino")){
                quantidade++;
            }
        }
        return quantidade;
    }

    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

        pessoas.add(new Pessoa("João", 20, "Masculino"));
        pessoas.add(new Pessoa("Maria", 25, "Feminino"));
        pessoas.add(new Pessoa("José", 30, "Masculino"));
        pessoas.add(new Pessoa("Ana", 35, "Feminino"));
        

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome() + " " + pessoa.getIdade() + " " + pessoa.getSexo());
        }

        Pessoa pessoa = new Pessoa("Ana", 35, "Feminino");
        System.out.println("Quantidade de mulheres: " + pessoa.quantidadeMulheres(pessoas));
    }
}
