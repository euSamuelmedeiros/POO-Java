package PraticaOrientaçaoAObjeto.test;

import PraticaOrientaçaoAObjeto.dominio.MaisUm;

public class MaisUmTest {
    public static void main(String[] args) {
        MaisUm one1 = new MaisUm("treino 1");
        MaisUm one2 = new MaisUm("treino 2");
        MaisUm one3 = new MaisUm("treino 3");

        MaisUm[] maisUm = {one1, one2, one3};

        for (MaisUm maisUm2 : maisUm) {
            maisUm2.imprimeSabombaAi();
            
        }
    }

}
