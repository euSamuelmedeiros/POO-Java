package zFormaçãoBASICA.Hashmap.Test;

import java.util.HashMap;
import java.util.Map;

public class ClienteTes03 {
    public static void main(String[] args) {
        Map<String, Integer> estoque = new HashMap<>();

        estoque.put("Banana", 4);
        estoque.put("feijao", 7);
        estoque.put("batata", 3);
        estoque.put("arroz", 40);

        estoque.remove("batata", 3);

        System.out.println("produtos em estoque: ");
        for (Map.Entry<String, Integer> intem : estoque.entrySet()) {
            System.out.println(intem.getKey() + " -> " + intem.getValue() + " Unidades. ");
        }

        System.out.println("------------------------");

        String txt = "arroz";
        if (estoque.containsKey(txt)) {
            System.out.println(txt + " estapresente no estoque e com " + estoque.get(txt) + " Unidades disponiveis.");
        } else {
            System.out.println(txt + "esta em falta no momento.");
        }
    }


}


