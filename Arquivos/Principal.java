import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<>();

        Aluno a1 = new Aluno("Angela", 20, "55996794579");
        Aluno a2 = new Aluno("Joao", 20, "55999998874");
        Aluno a3 = new Aluno("Vinicius", 20, "51984544223");

        Arquivo arquivo = new Arquivo("alunos");
        
        arquivo.gravaAluno(a1);
        arquivo.gravaAluno(a2);
        arquivo.gravaAluno(a3);

        alunos = arquivo.leArquivo();

        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }

    }
}
