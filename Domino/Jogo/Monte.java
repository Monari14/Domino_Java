package Jogo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
class Monte {
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
        ArrayList<String> pecasDisponiveis = new ArrayList<>(Arrays.asList(pecas));
        Random random = new Random(); // Mover a criação do objeto Random fora do loop

        for (int i = 1; i <= this.getQntJogador(); i++) {
            Jogador jg = new Jogador();
            ArrayList<String> maoJogador = new ArrayList<>();
            jg.setQntJogador(i);
            for (int ii = 1; ii <= 7; ii++) {
                int index = random.nextInt(pecasDisponiveis.size());
                String peca = pecasDisponiveis.remove(index);
                maoJogador.add(peca);
            }
            jg.setMao(maoJogador);
            jg.imprime();
        }
    }
}