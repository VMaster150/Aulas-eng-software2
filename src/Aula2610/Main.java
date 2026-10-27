package Aula2610;

public class Main {
    public static void main(String[] args) {
        TecladoUSBC teclado = new TecladoUSBC();
        Gabinete gabinete = new Gabinete();
        EntradaUSB adaptador = new Adaptador(teclado);
        gabinete.conectar(adaptador);
        gabinete.enviarParaDispositivo("OK");
    }
}