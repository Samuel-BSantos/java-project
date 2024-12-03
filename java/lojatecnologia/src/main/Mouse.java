package main;

/*

    A classe "Mouse" é associada à duas outras classes ("Notebook", "PC"), com as quais têm uma relação de agregação. Por quê?
    Nós sabemos que todo (ou a gigantesca maioria) notebook ten um touchpad que dispensa o uso de um mouse.
    Enquanto os PCs são utilizados para processamento de dados, host de plataformas web, etc.
    Sendo assim, o uso de mouse nesses dispositivos eletrônicos é dispensável nos mais variaáos casos.

    Faz-se dessa classe uma agregação, já que existem tanto Noteboooks, quanto PCs sem mouses.

*/

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
