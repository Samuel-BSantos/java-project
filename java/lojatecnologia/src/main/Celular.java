package main;
public class Celular extends Produto{

    private String Bateria;
    private String Tela;
    private camera cam;

    public Celular(String Nome, String Marca, Float Preco, String MemoriaRam, String Armazenamento, String CPU, String PlacaMae, String Conectores, String SistemaOperacional, Float Tamanho, Float Peso, Boolean SegundaMao, String Bateria, String Tela, camera cam){
        super(Nome,Marca,Preco,MemoriaRam,Armazenamento,CPU,PlacaMae,Conectores,SistemaOperacional,Tamanho,Peso,SegundaMao);
        
        this.Bateria = Bateria;
        this.Tela = Tela;
        this.cam = cam;
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

    public camera getCam()
    {
        return this.cam;
    }

    public void setCam(camera cam)
    {
        this.cam = cam;
    }

    public String imprimir(){
        return "\n ====CELULAR==== \n Nome: " + getNome() + "\n Marca: " + getMarca() + "\n Armazenamento: " + getArmazenamento() + "\n Câmera: " + cam.imprimir() + "\n ===============";
    }
}
