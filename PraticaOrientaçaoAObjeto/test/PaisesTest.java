package PraticaOrientaçaoAObjeto.test;

import PraticaOrientaçaoAObjeto.dominio.paises;

public class PaisesTest {
    public static void main(String[] args) {
        paises pais1  = new paises("Brasil");
        paises pais2  = new paises("canada");
        paises pais3  = new paises("Eua");

        paises[] pais = {pais1, pais2, pais3};

        for (paises paises : pais) {
            paises.imprimeeai();
            
        }
        
    }
    
}
