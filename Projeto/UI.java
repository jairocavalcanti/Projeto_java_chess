package Projeto;

import Xadrez.PecaXadrez;

// 'user_interface'
public class UI {

    public static void imprimirtabuleiro(PecaXadrez[][] pecas) {
        for (int i = 0; i < pecas.length; i++) {
            System.out.printf((8 - i) + " ");
            for (int j = 0; j < pecas.length; j++) {
                imprimirpeca(pecas[i][j]);
            }
            System.out.println();
        }
        System.out.println("  a b c d e f g h");
    }

    private static void imprimirpeca(PecaXadrez peca) {
        if (peca == null) {
            System.out.printf("-");
        } else {
            System.out.print(peca);
        }
        System.out.printf(" ");
    }

}
