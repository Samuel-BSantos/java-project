package main;

public class camera {
    private String frontal;
    private String traseira;

    public camera(String frontal, String traseira) {
        this.frontal = frontal;
        this.traseira = traseira;
    }
    public String getFrontal() {
        return frontal;
    }
    public void setFrontal(String frontal) {
        this.frontal = frontal;
    }
    public String getTraseira() {
        return traseira;
    }
    public void setTraseira(String traseira) {
        this.traseira = traseira;
    }

    public String imprimir(){
        return "Frontal: " + frontal + "  Traseira :" + traseira;
    }
}
