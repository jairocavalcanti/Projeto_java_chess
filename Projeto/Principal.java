package Projeto;

import Xadrez.PartidaXadrez;

public class Principal {
    public static void main(String[] args) {
       
        PartidaXadrez partidaxadrez = new PartidaXadrez();
        UI.imprimirtabuleiro(partidaxadrez.getpecas());



    }
}
