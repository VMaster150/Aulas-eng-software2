package Aula2610;

public class Adaptador implements EntradaUSB {

    private final TecladoUSBC teclado;

    public Adaptador(TecladoUSBC teclado) {
        this.teclado = teclado;
    }

    @Override
    public void enviarDadosUSB(String dados) {
        System.out.println("convertendo USB -> C");
        teclado.transmitirporC(dados);
    }

}