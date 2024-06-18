public class Aluno {
    private String nome;
    private int idade;
    private String telefone;
    
    

    public Aluno(String nome, int idade, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", idade=" + idade + ", telefone=" + telefone + "]";
    }

    

    
}