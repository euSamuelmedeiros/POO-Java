package zFormaçãoBASICA.treinoherança.test;

import zFormaçãoBASICA.treinoherança.domain.Cachorro;
import zFormaçãoBASICA.treinoherança.domain.Gato;

public class AnimalTEst {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro("MIke");
        Gato cat = new Gato("lulu");

        cat.FazerSom();
        dog.FazerSom();
    }
}
