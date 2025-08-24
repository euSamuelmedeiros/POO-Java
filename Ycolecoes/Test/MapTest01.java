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

    }
}
