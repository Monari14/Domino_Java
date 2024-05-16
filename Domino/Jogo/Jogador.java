package Jogo;

import java.util.ArrayList;
import java.util.Scanner;

public class Jogador {
    private int qntJogador;
    private ArrayList<String> mao;

    public ArrayList<String> getMao() {
        return mao;
    }

    public void setMao(ArrayList<String> mao) {
        this.mao = mao;
    }

    public void pesca(String peca) {
        this.mao.add(peca);
    }

    public int getQntJogador() {
        return qntJogador;
    }

    public void setQntJogador(int qntJogador) {
        this.qntJogador = qntJogador;
    }

    public void imprime() {
        do {
            Scanner scan = new Scanner(System.in);
            Mesa m = new Mesa();
            System.out.println
            ("""
            1 - Jogar
            2 - Pescar
            3 - Passar
            4 - Desistir
            5 - Dar a bunda
            """);
            int escolha = scan.nextInt();
            if(escolha == 1){
                m.imprimeJogar();
            }
        }while(this.mao.size() != 0);
        if(this.mao.size() == 0){
            System.out.println("Ganho!");
        }
        System.out.println("Jogador " + this.getQntJogador() + ": " + this.getMao());
    }
}