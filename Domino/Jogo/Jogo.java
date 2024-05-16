package Jogo;
import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Quantos Jogadores: ");
        int qntJogador = scan.nextInt();
        
        Monte m = new Monte();
        Jogador j = new Jogador();
        m.setQntJogador(qntJogador);
        
        m.distribuiPecas();
        j.imprime();
        
        scan.close(); // Fechar o Scanner no final do método main
    }
}