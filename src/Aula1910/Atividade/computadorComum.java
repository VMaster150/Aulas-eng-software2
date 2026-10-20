package Aula1910.Atividade;

public class computadorComum {
    public Computador criar() {
        return new Computador.Builder().processador("Ryzen 7 7735HS").
                memoria_ram(8).
                placa_de_video("Gráfico Integrado Vega 8").
                memoria_interna("512 GB").
                placa_mae("rapaz nem sei").
                build();

    }
}
