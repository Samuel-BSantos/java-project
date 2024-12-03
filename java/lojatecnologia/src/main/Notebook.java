package main;

/*
    A classe produto é a classe mãe de três outras classes (Notebook, PC e Celular). Por quê?
    Porque esses produtos devem herdar diversos atributos em comum, por exemplo: Nome, Marca e Sistema_Operacional.
    Entendemos que a produto é uma entidade fundamental e deve ser usada como classe mãe.

    Faz-se dessa classe uma classe "filha", pois, ela é um produto que será comercializado no software de nossa ideia.

*/

public class Notebook extends Produto{

    private String Bateria;
    private String Tela;
    private String Tipo_Resfriamento;
    private Mouse mouse;

    public Notebook(String Nome, String Marca, Float Preco, String MemoriaRam, String Armazenamento, String CPU, String PlacaMae, String Conectores, String SistemaOperacional, Float Tamanho, Float Peso,Boolean SegundaMao, String bateria, String tela, String tipo_Resfriamento, Mouse mouse) {
        super(Nome, Marca, Preco, MemoriaRam, Armazenamento, CPU, PlacaMae, Conectores, SistemaOperacional, Tamanho,
        Peso, SegundaMao);
        
        this.Bateria = bateria;
        this.Tela = tela;
        this.Tipo_Resfriamento = tipo_Resfriamento;
        this.mouse = mouse;
    }

    public String getBateria() {
        return Bateria;
    }

    public void setBateria(String bateria) {
        Bateria = bateria;
    }

    public String getTela() {
        return Tela;
    }

    public void setTela(String tela) {
        Tela = tela;
    }

    public String getTipo_Resfriamento() {
        return Tipo_Resfriamento;
    }

    public void setTipo_Resfriamento(String tipo_Resfriamento) {
        Tipo_Resfriamento = tipo_Resfriamento;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public String imprimir(){
        return "\n ====NOTEBOOK==== \n Nome: " + getNome() + "\n Marca: " + getMarca() + "\n Armazenamento: " + getArmazenamento() + "\n Memória Ram: " + getMemoriaRam() + "\n Mouse" + mouse.imprimir() +"\n ================";
    }
}
