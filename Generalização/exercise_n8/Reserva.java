package exercise_n8;

public class Reserva {
    public void adicionarReserva(){
        System.out.println("Adicionando reserva");
    }

    public void cancelarReserva(){
        System.out.println("Cancelando reserva");
    }

    public static void main(String[] args) {
        ReservaDeVoo reservaVoo = new ReservaDeVoo();
        reservaVoo.adicionarReserva("Primeira classe");
        reservaVoo.cancelarReserva();

        ReservaDeHotel reservaHotel = new ReservaDeHotel();
        reservaHotel.adicionarReserva("Suíte");
        reservaHotel.cancelarReserva();

        
        
    
    }
}
