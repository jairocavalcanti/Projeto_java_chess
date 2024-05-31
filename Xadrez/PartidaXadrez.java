package Xadrez;

import Tabuleiro_jogo.Posicao;
import Tabuleiro_jogo.Tabuleiro;
import Xadrez.pecas.Rei;
import Xadrez.pecas.Torre;

/*
  Classe que representa uma partida de xadrez.
  É responsável por inicializar e gerenciar o tabuleiro de xadrez.
*/

public class PartidaXadrez {

    private Tabuleiro tabuleiro;

    //Dimensionando o tamnho do tabuleiro de xadrez
    //A classe partidaxadrez é responsável por isso
    public PartidaXadrez(){
        //Inicializa uma nova partida de xadrez com um tabuleiro 8x8
        tabuleiro = new Tabuleiro(8, 8);
        setupinicial();
    }
    
    //Obtém a matriz de peças de xadrez do tabuleiro
    public PecaXadrez[][] getpecas(){
        PecaXadrez[][] mat = new PecaXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
        for(int i = 0; i < tabuleiro.getLinhas(); i++){
            for(int j = 0; j < tabuleiro.getLinhas(); j++){
                mat[i][j] = (PecaXadrez)tabuleiro.peca(i,j);
            }
        }
        return mat;
    }

    //metodo responsavel por iniciar a partida de xadrez colocando as peças no tabuleiro
    private void setupinicial(){
       tabuleiro.setarpeca(new Torre(tabuleiro, Cor.BRANCO), new Posicao(2,1));
       tabuleiro.setarpeca(new Rei(tabuleiro, Cor.PRETO), new Posicao(0,4));
       tabuleiro.setarpeca(new Rei(tabuleiro, Cor.BRANCO), new Posicao(7,4));
    }
}
