package Ycolecoes.Test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("teklado", "teclado");
        map.put("olla", "ola");
        map.put("vc", "você");
        System.out.println(map);

        for (String kay: map.keySet()){
            System.out.println(kay+ " = "+ map.get(kay));


            System.out.println("----------------------");

            for (Map.Entry<String, String> entry: map.entrySet()){
                System.out.println(entry.getKey()+ " = "+ entry.getValue());   // metodo para pagar chave e valor ao mesmo tempo.
            }
        }

    }
}
