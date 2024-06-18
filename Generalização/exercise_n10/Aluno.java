package exercise_n10;
import java.util.ArrayList;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    public Aluno(String nome, double nota1, double nota2){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public void calcularMedia(){
        System.out.println("Media: " + ((this.nota1 + this.nota2) / 2));
        if(((this.nota1 + this.nota2) / 2) >= 6.0){
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", nota1=" + nota1 + ", nota2=" + nota2 + "]";
    }

    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();

        alunos.add(new Aluno("João", 7.0, 8.0));
        alunos.add(new Aluno("Maria", 6.0, 9.0));
        alunos.add(new Aluno("José", 5.0, 5.6));
        

        for (Aluno aluno : alunos) {
            System.out.println(aluno);
            aluno.calcularMedia();
        }
    }

}
