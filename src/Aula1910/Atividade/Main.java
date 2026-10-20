package Aula1910.Atividade;

public class Main {

    public static void main(String[] args) {
        Computador ComputadorComum = new computadorComum().criar();

        Computador ComputadorGamer = new computadorGamer().criar();


        System.out.println("\n===============Computador Comum===============\n" + ComputadorComum);
        System.out.println("\n===============Computador Gamer===============\n" + ComputadorGamer);
    }
}
