package Gassociação.test;

import Gassociação.dominio.Jogador;

public class jogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("goku");
        Jogador jogador2 = new Jogador("broly");
        Jogador jogador3 = new Jogador("vegeta");

        Jogador[] jogadores = { jogador1, jogador2, jogador3 };

        for(Jogador Jogador: jogadores){
            Jogador.impime();

        }

    }

}
