package Exercicio8;

public class ReservaDeHotel extends Reserva {
    private String tipoQuarto;
    
    public void adicionarReserva(String tipoQuarto){
        this.setTipoQuarto(tipoQuarto);
        super.adicionarReserva();
        
    }

    @Override
    public void cancelarReserva() {
        System.out.println("Cancelando reserva de hotel");
    }

    public void setTipoQuarto(String tipoQuarto){
        this.tipoQuarto = tipoQuarto;
    }

    public String getTipoQuarto(){
        return this.tipoQuarto;
    }
    
}
