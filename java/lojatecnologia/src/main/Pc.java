package main;

/*
    A classe produto é a classe mãe de três outras classes (Notebook, PC e Celular). Por quê?
    Porque esses produtos devem herdar diversos atributos em comum, por exemplo: Nome, Marca e Sistema_Operacional.
    Entendemos que a produto é uma entidade fundamental e deve ser usada como classe mãe.

    Faz-se dessa classe uma classe "filha", pois, ela é um produto que será comercializado no software de nossa ideia.

*/

public class Pc extends Produto{
    
    private String Tipo_Resfriamento;
    private String Case;
    private String Fonte_Energia;
    private Mouse mouse;
    
    public Pc(String Nome, String Marca, Float Preco, String MemoriaRam, String Armazenamento, String CPU, String PlacaMae, String Conectores, String SistemaOperacional, Float Tamanho, Float Peso,Boolean SegundaMao, String tipo_Resfriamento, String case1, String fonte_Energia, Mouse mouse) {
        super(Nome, Marca, Preco, MemoriaRam, Armazenamento, CPU, PlacaMae, Conectores, SistemaOperacional, Tamanho,Peso, SegundaMao);

        this.Tipo_Resfriamento = tipo_Resfriamento;
        this.Case = case1;
        this.Fonte_Energia = fonte_Energia;
        this.mouse = mouse;
    }

    public String getTipo_Resfriamento() {
        return Tipo_Resfriamento;
    }

    public void setTipo_Resfriamento(String tipo_Resfriamento) {
        Tipo_Resfriamento = tipo_Resfriamento;
    }

    public String getCase() {
        return Case;
    }

    public void setCase(String case1) {
        Case = case1;
    }

    public String getFonte_Energia() {
        return Fonte_Energia;
    }

    public void setFonte_Energia(String fonte_Energia) {
        Fonte_Energia = fonte_Energia;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public String imprimir(){
        return "\n ====COMPUTADOR==== \n Nome: " + getNome() + "\n Marca: " + getMarca() + "\n Armazenamento: " + getArmazenamento() + "\n Memória Ram: " + getMemoriaRam() + "\n Mouse" + mouse.imprimir() + "\n ==================";
    }
}