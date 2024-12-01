package main;
public class Pc extends Produto{
    
    private String Tipo_Resfriamento;
    private String Case;
    private String Fonte_Energia;
    
    public Pc(String Nome, String Marca, Float Preco, String MemoriaRam, String Armazenamento, String CPU, String PlacaMae, String Conectores, String SistemaOperacional, Float Tamanho, Float Peso,Boolean SegundaMao, String tipo_Resfriamento, String case1, String fonte_Energia) {
        super(Nome, Marca, Preco, MemoriaRam, Armazenamento, CPU, PlacaMae, Conectores, SistemaOperacional, Tamanho,Peso, SegundaMao);

        this.Tipo_Resfriamento = tipo_Resfriamento;
        this.Case = case1;
        this.Fonte_Energia = fonte_Energia;
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

    public String imprimir(){
        return "\n ====COMPUTADOR==== \n Nome: " + getNome() + "\n Marca: " + getMarca() + "\n Armazenamento: " + getArmazenamento() + "\n Memória Ram: " + getMemoriaRam() +"\n ==================";
    }
}
