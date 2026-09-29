package Atividade2809;

public class FactoryEmail extends FactoryNotificacao{
    @Override
    public Notificacao create() {
        return new Email();
    }
}
