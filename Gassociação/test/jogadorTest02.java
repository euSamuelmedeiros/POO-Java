package Gassociação.test;

import Gassociação.dominio.Jogador;
import Gassociação.dominio.Time;

public class jogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("pelé");
        Time time = new Time("seleçao brasileira");

        jogador01.setTime(time);
        jogador01.impime();

    }

}
