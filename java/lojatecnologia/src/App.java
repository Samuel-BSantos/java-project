import main.Celular;
import main.Pc;
import main.Notebook;

public class App {
    public static void main(String[] args) throws Exception {

        Celular celular1 = new Celular("Xiaomi 14 Ultra", "Xiaomi", 8699.00, "16GB", "1T", "Qualcomm Snapdragon 8 Gen 3", null, null, "Android 14 com interface MIUI 14", 6.73, 224, false, "5300mAh.\nCarregamento rápido de 120W. \nCarregamento sem fio de 50W", "AMOLED LTPO", 0);
        Pc pc1 = new Pc("Highflyer", "Peças De Várias Marcas", 22599.96, "32GB DDR5", "1T", "Intel i7-14700Kd", "MSI MAG Z790 TOMAHAWK", null, "Windows 11", null, null, false, "WATER COOLER", null, "FONTE 1200W 80 PLUS GOLD");
        Notebook notebook1 = new Notebook("Predator Helios Neo", "Acer", 8679, "16GB DDR5", "1T", "Intel® Core™ i7-13650HX", null, null, "Windows 11 Home", null, 2600, false, "5850 mAh", "165 Hz", null);

        System.out.println("====CELULAR====" + "\n" + "Nome: " + celular1.getNome() + "\n" + "Marca: " + celular1.getMarca() + "\n" + "Preco: R$" + celular1.getPreco() + "\n" + "Mémoria Ram: " + celular1.getMemoriaRam() + "\n" + "Armazenamento: " + celular1.getArmazenamento() + "\n" + "Cpu: " + celular1.getCPU() + "\n" + "Placa Mãe: " + celular1.getPlacaMae() + "\n" + "Conectores: " + celular1.getConectores() + "\n" + "OS: " + celular1.getSistemaOperacional() + "\n" + "Tamanho: " + celular1.getTamanho() + " Cm" + "\n" + "Peso: " + celular1.getPeso() + "Kg" + "\n" + "Segunda mão: " + celular1.getSegundaMao() + "\n" + "Bateria: " + celular1.getBateria() + "\n" + "Tela: " + celular1.getTela() + "\n" + "QTD de câmeras: " + celular1.getQtd_Cameras() + "\n" + "===============" + "\n");

        System.out.println("====COMPUTADOR====" + "\n" + "Nome: " + pc1.getNome() + "\n" + "Marca: " + pc1.getMarca() + "\n" + "Preco: R$" + pc1.getPreco() + "\n" + "Mémoria Ram: " + pc1.getMemoriaRam() + "\n" + "Armazenamento: " + pc1.getArmazenamento() + "\n" + "Cpu: " + pc1.getCPU() + "\n" + "Placa Mãe: " + pc1.getPlacaMae() + "\n" + "Conectores: " + pc1.getConectores() + "\n" + "OS: " + pc1.getSistemaOperacional() + "\n" + "Tamanho: " + pc1.getTamanho() + " Cm" + "\n" + "Peso: " + pc1.getPeso() + "Kg" + "\n" + "Segunda mão: " + pc1.getSegundaMao() + "\n" + "Tipo de resfriamento: " + pc1.getTipo_Resfriamento() + "\n" + "Case: " + pc1.getCase() + "\n" + "Fonte: " + pc1.getFonte_Energia() + "\n" + "===============" + "\n");

        System.out.println("====NOTEBOOK====" + "\n" + "Nome: " + notebook1.getNome() + "\n" + "Marca: " + notebook1.getMarca() + "\n" + "Preco: R$" + notebook1.getPreco() + "\n" + "Mémoria Ram: " + notebook1.getMemoriaRam() + "\n" + "Armazenamento: " + notebook1.getArmazenamento() + "\n" + "Cpu: " + notebook1.getCPU() + "\n" + "Placa Mãe: " + notebook1.getPlacaMae() + "\n" + "Conectores: " + notebook1.getConectores() + "\n" + "OS: " + notebook1.getSistemaOperacional() + "\n" + "Tamanho: " + notebook1.getTamanho() + " Cm" + "\n" + "Peso: " + notebook1.getPeso() + "Kg" + "\n" + "Segunda mão: " + notebook1.getSegundaMao() + "\n" + "Bateria: " + notebook1.getBateria() + "\n" + "Tela: " + notebook1.getTela() + "\n" + "Tipo de resfriamento: " + notebook1.getTipo_Resfriamento() + "\n" + "===============" + "\n");
    }
}
