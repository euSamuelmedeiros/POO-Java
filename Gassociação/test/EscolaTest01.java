package Gassociação.test;

import Gassociação.dominio.Escola;
import Gassociação.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Romero vulgo gordao");
        Professor professor2 = new Professor("Carol ");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Jose augusto", professores);

        escola.imprimeAi();
    }
    
}
