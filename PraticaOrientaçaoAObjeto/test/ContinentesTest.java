package PraticaOrientaçaoAObjeto.test;

import PraticaOrientaçaoAObjeto.dominio.continentes;

public class ContinentesTest {
    public static void main(String[] args) {
        continentes cont1 = new continentes("America do sul");
        continentes cont2 = new continentes("America do Norte");
        continentes cont3 = new continentes("Oceania");

        continentes[] continentes = {cont1, cont2, cont3};
        for (continentes continentees : continentes) {
            continentees.imprimeAiBagaça();
        
        }


    }

}
