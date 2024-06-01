package exercise_n7;

public class NotificacaoEmail extends Notificacao {
    @Override
    public void enviar() {
        System.out.println("Enviando notificação por email");
    }

    
    public void enviar(int n) {
        System.out.println("Enviando notificação por email para " + n + " pessoa(s)");
    }
}
