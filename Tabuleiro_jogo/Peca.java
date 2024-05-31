package Tabuleiro_jogo;

/*
  Classe que representa uma peça genérica no tabuleiro de jogo.
  Esta classe será a base para peças específicas, como peças de xadrez.
*/

public class Peca {

    protected Posicao posicao;
    private Tabuleiro tabuleiro;

    public Peca(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
        this.posicao = null;
    }

    protected Tabuleiro getTabuleiro() {
        return tabuleiro;
    }

}
