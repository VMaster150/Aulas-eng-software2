package Atividade2809;

public class FactorySMS extends FactoryNotificacao{


    @Override
    public Notificacao create() {
        return new SMS();
    }
}
