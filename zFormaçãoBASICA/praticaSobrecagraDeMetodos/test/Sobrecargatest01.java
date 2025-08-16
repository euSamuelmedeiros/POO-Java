package zFormaçãoBASICA.praticaSobrecagraDeMetodos.test;

import zFormaçãoBASICA.praticaSobrecagraDeMetodos.domain.design;

public class Sobrecargatest01 {
    public static void main(String[] args) {
        design d1 = new design("DBZ", "Anime", 300);
        System.out.println(d1);

        design d2 = new design("naruto", "ruim", 900);
        System.out.println(d2);
    }

}
