package Aula2610;

public class Gabinete {

    private EntradaUSB portaUSB;

    public void conectar(EntradaUSB dispositivo) {
        this.portaUSB = dispositivo;
        System.out.println("Conectando algo");
    }

    public void enviarParaDispositivo(String msg) {
        portaUSB.enviarDadosUSB(msg);
    }
}