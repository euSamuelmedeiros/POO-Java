package zFormaçãoBASICA.treinoherança.test;

import zFormaçãoBASICA.treinoherança.domain.Carro;
import zFormaçãoBASICA.treinoherança.domain.Moto;
import zFormaçãoBASICA.treinoherança.domain.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class TestVeiculo {
    public static void main(String[] args) {
        List<Veiculo> listVeiculo = new ArrayList<>();

        listVeiculo.add(new Carro("Fiat", "Fuscao", 1970, 4));
        listVeiculo.add(new Moto("honda", "160", 2000, 100));

        for (Veiculo v : listVeiculo) {
            System.out.println(v);
            System.out.printf("impostos R$ %.2f%n", v.calcularImposto());
            System.out.println("-------------");
        }

    }
}
