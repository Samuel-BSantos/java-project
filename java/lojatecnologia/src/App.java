import main.Celular;
import main.Pc;
import main.camera;
import main.Notebook;
import main.Mouse;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        

        // instâncias de mouse (notebook)
        Mouse mouse1 = new Mouse(null, null, null);
        Mouse mouse2 = new Mouse(null, null, null); 
        Mouse mouse3 = new Mouse(null, null, null);
        
        // instâncias de mouse (PC)
        Mouse mousePc1 = new Mouse(null, null, null);
        Mouse mousePc2 = new Mouse(null, null, null);
        Mouse mousePc3 = new Mouse(null, null, null);

        // instâncias de celular
        Celular celular1 = new Celular(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        Celular celular2 = new Celular(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        Celular celular3 = new Celular(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);


        // instâncias de câmera
        camera camera1 = new camera(null, null);
        camera camera2 = new camera(null, null);
        camera camera3 = new camera(null, null);


        // instâncias de notebook
        Notebook notebook1 = new Notebook(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        Notebook notebook2 = new Notebook(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        Notebook notebook3 = new Notebook(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);


        // instâncias de pc
        Pc pc1 = new Pc(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        Pc pc2 = new Pc(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        Pc pc3 = new Pc(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);


        // arrays
        Pc[] pcs = {pc1, pc2, pc3};
        Mouse[] mouses = {mouse1, mouse2, mouse3};
        camera[] cameras = {camera1, camera2, camera3};
        Mouse[] mousesPc = {mousePc1, mousePc2, mousePc3};
        Celular[] celulares = {celular1, celular2, celular3};
        Notebook[] notebooks = {notebook1, notebook2, notebook3};


        for (int i = 0; i < 3; i++)
        {
            System.out.println("digite o nome do celular:");
            celulares[i].setNome(entrada.nextLine());

            System.out.println("digite a marca do celular:");
            celulares[i].setMarca(entrada.nextLine());

            System.out.println("digite o armazenamento do celular:");
            celulares[i].setArmazenamento(entrada.nextLine());

            System.out.println("digite o MP da câmera frontal ex(12MP):");
            cameras[i].setFrontal(entrada.nextLine());

            System.out.println("digite o(s) MP da(s) câmera(s) traseira(s) ex(12MP, 200MP, 50MP, 10MP):");
            cameras[i].setTraseira(entrada.nextLine());

            celulares[i].setCam(camera1);

        }


        for (int i = 0; i < 3; i++)
        {
            System.out.println("digite o nome do notebook:");
            notebooks[i].setNome(entrada.nextLine());

            System.out.println("digite a marca do notebook:");
            notebooks[i].setMarca(entrada.nextLine());

            System.out.println("digite o armazenamento do notebook:");
            notebooks[i].setArmazenamento(entrada.nextLine());

            System.out.println("digite a memória RAM do notebook:");
            notebooks[i].setMemoriaRam(entrada.nextLine());

            System.out.println("digite o DPI do mouse do notebook:");
            mouses[i].setDPI(entrada.nextLine());

            System.out.println("digite a qtd de botões do mouse do notebook:");
            mouses[i].setQTDbotoes(entrada.nextLine());

            System.out.println("digite o nome do mouse do notebook:");
            mouses[i].setNome(entrada.nextLine());

            notebooks[i].setMouse(mouse1);
        }


        for (int i = 0; i < 3; i++)
        {
            System.out.println("digite o nome do PC:");
            pcs[i].setNome(entrada.nextLine());

            System.out.println("digite a marca do PC:");
            pcs[i].setMarca(entrada.nextLine());

            System.out.println("digite o armazenamento do PC:");
            pcs[i].setArmazenamento(entrada.nextLine());

            System.out.println("digite a memória RAM do PC:");
            pcs[i].setMemoriaRam(entrada.nextLine());

            System.out.println("digite o DPI do mouse do PC:");
            mousesPc[i].setDPI(entrada.nextLine());

            System.out.println("digite a qtd de botões do mouse do PC:");
            mousesPc[i].setQTDbotoes(entrada.nextLine());

            System.out.println("digite o nome do mouse do PC:");
            mousesPc[i].setNome(entrada.nextLine());

            pcs[i].setMouse(mouse2);
        }



        // Imprime pcs
        for (int i = 0; i < 3; i++)
            System.out.println(pcs[i].imprimir());

        // Imprime mouses (pc)
        for (int i = 0; i < 3; i++)
            System.out.println(mousesPc[i].imprimir());
        
        // Imprime Celular
        for (int i = 0; i < 3; i++)
            System.out.println(celulares[i].imprimir());

        // Imprime Cameras
        for (int i = 0; i < 3; i++)
            System.out.println(cameras[i].imprimir());

        // Imprime Notebooks
        for (int i = 0; i < 3; i++)
            System.out.println(notebooks[i].imprimir());
        
        // Imprime mouses (notebooks)
        for (int i = 0; i < 3; i++)
            System.out.println(mouses[i].imprimir());

    }
}
