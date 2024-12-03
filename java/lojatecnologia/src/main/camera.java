package main;

/*

    A classe celular tem a classe _câmeras_ como associação (composição).
    Essa relação (toda-parte forte) se dá ao fato de não termos, nos dias atuais, celulares sem câmeras.
    Como nosso software se trata de uma loja de venda de tecnologia é ilógico vender dispositivos celulares sem câmera. Portanto, composição.

    Faz-se dessa classe uma composição, já que não há celulares sem câmeras no nosso software.

*/
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
