import main.Celular;
import main.Pc;
import main.camera;
import main.Notebook;
import main.Mouse;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        Mouse mouse1 = new Mouse(null, null, null);

        Mouse mouse2 = new Mouse(null, null, null);
     
        Celular celular1 = new Celular(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);

        camera camera1 = new camera(null, null);

        Notebook notebook1 = new Notebook(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);

        Pc pc1 = new Pc(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);

        System.out.println("digite o nome do celular:");
        celular1.setNome(entrada.nextLine());

        System.out.println("digite a marca do celular:");
        celular1.setMarca(entrada.nextLine());

        System.out.println("digite o armazenamento do celular:");
        celular1.setArmazenamento(entrada.nextLine());

        System.out.println("digite o MP da câmera frontal ex(12MP):");
        camera1.setFrontal(entrada.nextLine());

        System.out.println("digite o(s) MP da(s) câmera(s) traseira(s) ex(12MP, 200MP, 50MP, 10MP):");
        camera1.setTraseira(entrada.nextLine());

        celular1.setCam(camera1);

        System.out.println("digite o nome do notebook:");
        notebook1.setNome(entrada.nextLine());

        System.out.println("digite a marca do notebook:");
        notebook1.setMarca(entrada.nextLine());

        System.out.println("digite o armazenamento do notebook:");
        notebook1.setArmazenamento(entrada.nextLine());

        System.out.println("digite a memória RAM do notebook:");
        notebook1.setMemoriaRam(entrada.nextLine());

        System.out.println("digite o DPI do mouse do notebook:");
        mouse1.setDPI(entrada.nextLine());

        System.out.println("digite a qtd de botões do mouse do notebook:");
        mouse1.setQTDbotoes(entrada.nextLine());

        System.out.println("digite o nome do mouse do notebook:");
        mouse1.setNome(entrada.nextLine());

        notebook1.setMouse(mouse1);

        System.out.println("digite o nome do PC:");
        pc1.setNome(entrada.nextLine());

        System.out.println("digite a marca do PC:");
        pc1.setMarca(entrada.nextLine());

        System.out.println("digite o armazenamento do PC:");
        pc1.setArmazenamento(entrada.nextLine());

        System.out.println("digite a memória RAM do PC:");
        pc1.setMemoriaRam(entrada.nextLine());

        System.out.println("digite o DPI do mouse do PC:");
        mouse2.setDPI(entrada.nextLine());

        System.out.println("digite a qtd de botões do mouse do PC:");
        mouse2.setQTDbotoes(entrada.nextLine());

        System.out.println("digite o nome do mouse do PC:");
        mouse2.setNome(entrada.nextLine());

        pc1.setMouse(mouse2);

        System.out.println(celular1.imprimir());
        System.out.println(notebook1.imprimir());
        System.out.println(pc1.imprimir());
    }
}
