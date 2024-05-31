package Exercicio7;

public class Notificacao {
    public void enviar(){
        System.out.println("Enviando notificação");
    }

    public static void main(String[] args) {
        NotificacaoEmail email = new NotificacaoEmail();
        email.enviar();
        email.enviar(2);

        NotificacaoApp app = new NotificacaoApp();
        app.enviar();

        Notificacao notificacao = new Notificacao();
        notificacao.enviar();
    }
}
