package Atividade2809;

public class Main {
    public static void main(String[] args) {
        Notificacao sms = new FactoryEmail().create();
        sms.enviar();
    }



}
