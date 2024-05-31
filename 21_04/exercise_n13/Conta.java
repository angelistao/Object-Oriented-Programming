package Exercicio13;
import java.util.ArrayList;

public class Conta {
    private int numero;
    private String titular;
    private double saldo;

    public Conta(int numero, String titular, double saldo){
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    

    public int getNumero() {
        return numero;
    }



    public void setNumero(int numero) {
        this.numero = numero;
    }



    public String getTitular() {
        return titular;
    }



    public void setTitular(String titular) {
        this.titular = titular;
    }



    public double getSaldo() {
        return saldo;
    }



    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }



    public Conta encontraMaiorSaldo(ArrayList<Conta> contas){
        Conta maiorSaldo = contas.get(0);
        for (Conta conta : contas) {
            if(conta.getSaldo() > maiorSaldo.getSaldo()){
                maiorSaldo = conta;
            }
        }
        return maiorSaldo;
    }

    

    @Override
    public String toString() {
        return "Conta [numero=" + numero + ", titular=" + titular + ", saldo=" + saldo + "]";
    }



    public static void main(String[] args) {
        ArrayList<Conta> contas = new ArrayList<Conta>();

        contas.add(new Conta(1, "João", 1000.0));
        contas.add(new Conta(2, "José", 3000.0));
        contas.add((new Conta(3, "Pedro", 5000.0)));   
        contas.add(new Conta(4, "Maria", 2000.0));
        contas.add(new Conta(5, "Ana", 4000.0));

        for (Conta conta : contas) {
            System.out.println(conta);
        }

        Conta contaMaiorSaldo = new Conta(0, "", 0.0);
        contaMaiorSaldo = contaMaiorSaldo.encontraMaiorSaldo(contas);
        System.out.println("Conta com maior saldo: " + contaMaiorSaldo);
    }
}
