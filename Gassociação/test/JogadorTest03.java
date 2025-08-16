package Gassociação.test;

import Gassociação.dominio.Jogador;
import Gassociação.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("kafu");
        Time time = new Time("brasil");
        Jogador[] jogadores = {jogador};

        jogador.setTime(time);
        time.setJogador(jogadores);

        jogador.impime();
        
    }
    
}
