package Exercicio8;

public class ReservaDeVoo extends Reserva {
    private String classe;
    
    public void adicionarReserva(String classe){
        this.setClasse(classe);
        super.adicionarReserva();
        
    }

    @Override
    public void cancelarReserva() {
        System.out.println("Cancelando reserva de voo");
    }

    public void setClasse(String classe){
        this.classe = classe;
    }

    public String getClasse(){
        return this.classe;
    }


}
