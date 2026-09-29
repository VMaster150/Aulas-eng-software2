package Atividade2809;

public class Main {
    public static void main(String[] args) {
        Notificacao email = new FactoryEmail().create();
        email.enviar();

        Notificacao push = new FactoryPush().create();
        push.enviar();

        Notificacao sms = new FactorySMS().create();
        sms.enviar();
    }



}
