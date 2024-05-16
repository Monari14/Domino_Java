package Jogo;

import java.util.ArrayList;

public class Mesa {
    private ArrayList<String> mesa;

    public ArrayList<String> getMesa() {
        return mesa;
    }

    public void setMesa(ArrayList<String> mesa) {
        this.mesa = mesa;
    }

public void imprimeJogar() {
    Jogador jg = new Jogador();
        if (!jg.getMao().isEmpty()) {
            System.out.println("Jogador " + jg.getQntJogador() + ": " + jg.getMao().get(0));
            // Se necessário, você pode adicionar lógica adicional relacionada à jogada aqui.
        } else {
            System.out.println("Tu já ganhou...");
        }        
    }
}