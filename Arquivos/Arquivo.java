import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Arquivo {
    private FileWriter arqw;
    private BufferedWriter escritor;
    private FileReader arqr;
    private BufferedReader leitor;
    public String nomeArquivo;
    private ArrayList<Aluno> listaAlunos;

    public Arquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
        listaAlunos = new ArrayList<>();
    }

    public void gravaAluno(Aluno o) {
        // Escrevendo os alunos em um arquivo de texto
        listaAlunos.clear();
        try {
            arqw = new FileWriter(nomeArquivo + ".txt", true);
            escritor = new BufferedWriter(arqw);

            escritor.write(o.getNome() + ";" + o.getIdade() + ";" + o.getTelefone());
            escritor.newLine();

            escritor.close();
            arqw.close();

            System.out.println("Alunos escritos no arquivo com exito.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Aluno> leArquivo(){
        // Lendo os alunos do arquivo
        listaAlunos.clear();
        try {
            arqr = new FileReader(nomeArquivo+".txt");
            leitor = new BufferedReader(arqr);
            String linha;

            while((linha = leitor.readLine()) != null){
                String[] campos = linha.split(";");

                String nome = campos[0];
                int idade = Integer.parseInt(campos[1]);
                String telefone = campos[2];

                Aluno o = new Aluno(nome, idade, telefone);

                listaAlunos.add(o);
            }

            leitor.close();
            arqr.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }

        return listaAlunos;
    }
    
}
