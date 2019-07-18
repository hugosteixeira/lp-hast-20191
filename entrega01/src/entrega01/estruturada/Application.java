package entrega01.estruturada;

import java.util.HashMap;
import java.util.Map;


public class Application {
    public static void main(String[] args) {
        Map<String, String> carro = new HashMap<>();
        carro.put("Portas","2");
        carro.put("Rodas", "4");
        carro.put("Cor", "Azul");
        carro.put("Marca", "Ford");
        System.out.println("Rodas: "+carro.get("Rodas"));
    }
}
