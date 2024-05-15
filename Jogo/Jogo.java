package Jogo;
import java.util.Scanner;
public class Jogo {
    
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Quantos Jogadores: ");
        int qntJogador = scan.nextInt();
        scan.close();
        Monte m = new Monte();
        Jogador j = new Jogador();
        m.setQntJogador(qntJogador);
        //j.jogadorPesca();
        m.distribuiPecas();
    }
}