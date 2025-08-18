package zFormaçãoBASICA.TreinoQualquer.test;

import zFormaçãoBASICA.TreinoQualquer.dominio.Jogador;
import zFormaçãoBASICA.TreinoQualquer.dominio.Time;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Messi");
        Time time = new Time("Argentina");

        jogador.setName(time);
        jogador.impimeSabostaAi();

    }

}
