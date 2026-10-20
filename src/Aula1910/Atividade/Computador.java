package Aula1910.Atividade;

public class Computador {

    private String processador;
    private int memoria_ram;
    private String placa_de_video;
    private String memoria_interna;
    private String placa_mae;

    public Computador(Builder builder) {
        this.processador = builder.processador;
        this.memoria_ram = builder.memoria_ram;
        this.placa_de_video = builder.placa_de_video;
        this.memoria_interna = builder.memoria_interna;
        this.placa_mae = builder.placa_mae;
    }

    public static class Builder {
        private String processador;
        private int memoria_ram;
        private String placa_de_video;
        private String memoria_interna;
        private String placa_mae;

        public Builder processador(String processador) {
            this.processador = processador;
            return this;
        }
        public Builder memoria_ram(int memoria_ram) {
            this.memoria_ram = memoria_ram;
            return this;
        }
        public Builder placa_de_video(String placa_de_video){
            this.placa_de_video = placa_de_video;
            return this;
        }
        public Builder memoria_interna(String memoria_interna){
            this.memoria_interna = memoria_interna;
            return this;
        }
        public Builder placa_mae(String placa_mae) {
            this.placa_mae = placa_mae;
            return this;
        }


        public Computador build() {
            return new Computador(this);
        }
    }

    @Override
    public String toString() {
        return "processador = " + processador + "\n" +
                " memoria_ram = " + memoria_ram + "\n" +
                " placa_de_video = " + placa_de_video + "\n" +
                " memoria_interna = " + memoria_interna + "\n" +
                " placa_mae = " + placa_mae + "\n";
    }
}
