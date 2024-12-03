package main;

/*
    
    Prdouto, nossa classe mãe, descreva informações emcomuns todo e qualquer item que será vendido na nossa plataforma e,
    consequementemente, representa as três classes filhas (Notebook, PC e celular)

*/

public abstract class Produto
{
    private String Nome;
    private String Marca;
    private Float Preco;
    private String MemoriaRam;
    private String Armazenamento;
    private String CPU;
    private String PlacaMae;
    private String Conectores;
    private String SistemaOperacional;
    private Float Tamanho;
    private Float Peso;
    private Boolean SegundaMao;


    public Produto(String Nome, String Marca, Float Preco, String MemoriaRam, String Armazenamento, String CPU, String PlacaMae, String Conectores, String SistemaOperacional, Float Tamanho, Float Peso, Boolean SegundaMao)
    {
        this.Nome = Nome;
        this.Marca = Marca;
        this.Preco = Preco;
        this.MemoriaRam = MemoriaRam;
        this.Armazenamento = Armazenamento;
        this.CPU = CPU;
        this.PlacaMae = PlacaMae;
        this.Conectores = Conectores;
        this.SistemaOperacional = SistemaOperacional;
        this.Tamanho = Tamanho;
        this.Peso = Peso;
        this.SegundaMao = SegundaMao;
    }

    public String getNome()
    {
        return this.Nome;
    }

    public String getMarca()
    {
        return this.Marca;
    }

    public Float getPreco()
    {
        return this.Preco;
    }

    public String getMemoriaRam()
    {
        return this.MemoriaRam;
    }

    public String getArmazenamento()
    {
        return this.Armazenamento;
    }

    public String getCPU()
    {
        return this.CPU;
    }

    public String getPlacaMae()
    {
        return this.PlacaMae;
    }

    public String getConectores()
    {
        return this.Conectores;
    }

    public String getSistemaOperacional()
    {
        return this.SistemaOperacional;
    }

    public Float getTamanho()
    {
        return this.Tamanho;
    }

    public Float getPeso()
    {
        return this.Peso;
    }

    public Boolean getSegundaMao()
    {
        return this.SegundaMao;
    }

    public void setNome(String Nome)
    {
        this.Nome = Nome;
    }

    public void setMarca(String Marca)
    {
        this.Marca = Marca;
    }

    public void setPreco(Float Preco)
    {
        this.Preco = Preco;
    }

    public void setMemoriaRam(String MemoriaRam)
    {
        this.MemoriaRam = MemoriaRam;
    }

    public void setArmazenamento(String Armazenamento)
    {
        this.Armazenamento = Armazenamento;
    }

    public void setCPU(String CPU)
    {
        this.CPU = CPU;
    }

    public void setPlacaMae(String PlacaMae)
    {
        this.PlacaMae = PlacaMae;
    }

    public void setConectores(String Conectores)
    {
        this.Conectores = Conectores;
    }

    public void setSistemaOperacional(String SistemaOperacional)
    {
        this.SistemaOperacional = SistemaOperacional;
    }

    public void setTamanho(Float Tamanho)
    {
        this.Tamanho = Tamanho;
    }

    public void setPeso(Float Peso)
    {
        this.Peso = Peso;
    }

    public void setSegundaMao(Boolean SegundaMao)
    {
        this.SegundaMao = SegundaMao;
    }
}