package entrega01.OO.gui;
import entrega01.OO.dominio.Carro;

public class Application {
    public static void main(String[] args) {
        Carro carro = new Carro();
        setCarro(carro);
        System.out.println("Rodas: "+carro.getRodas());
    }

    private static void setCarro(Carro carro) {
        carro.setCor("Azul");
        carro.setMarca("VW");
        carro.setPortas(3);
        carro.setRodas(3);
    }
}