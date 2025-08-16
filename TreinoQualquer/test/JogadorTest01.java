package TreinoQualquer.test;

import TreinoQualquer.dominio.Jogador;
import TreinoQualquer.dominio.Time;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Messi");
        Time time = new Time("Argentina");

        jogador.setName(time);
        jogador.impimeSabostaAi();

    }

}
