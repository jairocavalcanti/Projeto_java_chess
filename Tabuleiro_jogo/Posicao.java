package Tabuleiro_jogo;

public class Posicao {

    private int linha;
    private int column;
    
    public Posicao(int linha, int column) {
        this.linha = linha;
        this.column = column;
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    @Override
    public String toString() {
        return linha + "," + column;
    }

    
}
