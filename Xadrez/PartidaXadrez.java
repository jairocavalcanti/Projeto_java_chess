package Xadrez;

import Tabuleiro_jogo.Tabuleiro;

public class PartidaXadrez {

    private Tabuleiro tabuleiro;

    //Dimensionando o tamnho do tabuleiro de xadrez
    //A classe partidaxadrez é responsável por isso
    public PartidaXadrez(){
        tabuleiro = new Tabuleiro(8, 8);
    }
    
    public PecaXadrez[][] getpecas(){
        PecaXadrez[][] mat = new PecaXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
        for(int i = 0; i < tabuleiro.getLinhas(); i++){
            for(int j = 0; j < tabuleiro.getLinhas(); j++){
                mat[i][j] = (PecaXadrez)tabuleiro.peca(i,j);
            }
        }
        return mat;
    }

}
