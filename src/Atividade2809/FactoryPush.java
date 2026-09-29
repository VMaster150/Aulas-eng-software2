package Atividade2809;

public class FactoryPush extends FactoryNotificacao{
    @Override
    public Notificacao create() {
        return new Push();
    }
}
