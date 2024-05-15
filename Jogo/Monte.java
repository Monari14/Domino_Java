package Jogo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Monte {
    private int qntJogador;

    public int getQntJogador() {
        return qntJogador;
    }

    public void setQntJogador(int qntJogador) {
        this.qntJogador = qntJogador;
    }

    String[] pecas = {
        "|0|0|", "|1|0|", "|2|0|", "|3|0|", "|4|0|", "|5|0|", "|6|0|",
        "|1|1|", "|2|1|", "|3|1|", "|4|1|", "|5|1|", "|6|1|",
        "|2|2|", "|3|2|", "|4|2|", "|5|2|", "|6|2|",
        "|3|3|", "|4|3|", "|5|3|", "|6|3|",
        "|4|4|", "|5|4|", "|6|4|",
        "|5|5|", "|6|5|",
        "|6|6|"
};
    public void distribuiPecas() {
        ArrayList<String> peca = new ArrayList<>(Arrays.asList(pecas));
        int cont = 0;
        for (int ii = 0; ii < this.getQntJogador(); ii++) {
            cont++;
            System.out.println("Jogador: "+cont);
            for (int i = 1; i <= 7; i++) {
                Random random = new Random();
                int res = random.nextInt(peca.size());
                System.out.println(peca.remove(res));
            }
            System.out.println("-----");
        }
    }
}