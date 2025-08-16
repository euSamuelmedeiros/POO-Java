package PraticaOrientaçaoAObjeto.test;

import PraticaOrientaçaoAObjeto.dominio.Mecanico;
import PraticaOrientaçaoAObjeto.dominio.mecanicoFusca;

public class MecanicoFuscaTest01 {
    public static void main(String[] args) {
        Mecanico mecanico = new Mecanico("gerson");
        mecanicoFusca mecanicofusca = new mecanicoFusca("fusçao bala");

        mecanico.setfusca(mecanicofusca);
        mecanico.impime();
    }


    
}
