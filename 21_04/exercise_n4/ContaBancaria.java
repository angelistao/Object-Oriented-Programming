package Exercicio4;

public class ContaBancaria {
    protected double saldo;

    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        saldo = saldo + valor;
    }

    public void depositar(Cheque cheque){
        saldo = saldo + cheque.getValor();
    }

    public void exibeSaldo(){
        System.out.println("saldo=R$" + this.saldo);
    }

    
}
