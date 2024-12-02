package main;

public class Mouse {
    private String DPI;
    private String QTDbotoes;
    private String Nome;
    
    public Mouse(String dPI, String qTDbotoes, String nome) {
        DPI = dPI;
        QTDbotoes = qTDbotoes;
        Nome = nome;
    }

    public String getDPI() {
        return DPI;
    }

    public void setDPI(String dPI) {
        DPI = dPI;
    }

    public String getQTDbotoes() {
        return QTDbotoes;
    }

    public void setQTDbotoes(String qTDbotoes) {
        QTDbotoes = qTDbotoes;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }
    
    public String imprimir(){
        return "DPI: " + DPI + "  QTD.botões : " + QTDbotoes + "  Nome: " + Nome;
    }
}
