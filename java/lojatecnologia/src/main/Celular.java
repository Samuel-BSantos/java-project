package main;
public class Celular extends Produto{

    private String Bateria;
    private String Tela;
    private int Qtd_Cameras;

    public Celular(String Nome, String Marca, Float Preco, String MemoriaRam, String Armazenamento, String CPU, String PlacaMae, String Conectores, String SistemaOperacional, Float Tamanho, Float Peso, Boolean SegundaMao, String Bateria, String Tela, int Qtd_Cameras){
        super(Nome,Marca,Preco,MemoriaRam,Armazenamento,CPU,PlacaMae,Conectores,SistemaOperacional,Tamanho,Peso,SegundaMao);
        
        this.Bateria = Bateria;
        this.Tela = Tela;
        this.Qtd_Cameras = Qtd_Cameras;
    }

    public String getBateria()
    {
        return this.Bateria;
    }

    public void setBateria(String Bateria)
    {
        this.Bateria = Bateria;
    }

    public String getTela()
    {
        return this.Tela;
    }

    public void setTela(String Tela)
    {
        this.Tela = Tela;
    }

    public int getQtd_Cameras()
    {
        return this.Qtd_Cameras;
    }

    public void setQtd_Cameras(int Qtd_Cameras)
    {
        this.Qtd_Cameras = Qtd_Cameras;
    }
}
