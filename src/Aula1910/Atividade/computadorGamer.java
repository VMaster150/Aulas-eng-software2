package Aula1910.Atividade;

public class computadorGamer {
    public Computador criar(){
        return new Computador.Builder()
                .processador("AMD Ryzen 9 9950X")
                .memoria_interna("2048")
                .memoria_ram(64)
                .placa_de_video("NVIDIA RTX 2080TI ROF Edition")
                .placa_mae("Z590")
                .build();

    }
}
