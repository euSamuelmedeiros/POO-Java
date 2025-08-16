package BintroduçãoMetodos.test;

import BintroduçãoMetodos.dominio.Estudante;
import BintroduçãoMetodos.dominio.impressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante studenty = new Estudante(); // ---> criação de objeto
        Estudante studenty2 = new Estudante(); // ---> criação de objeto
        impressoraEstudante impressora = new impressoraEstudante();

        studenty.name = "goku";
        studenty.idade = 49;
        studenty.sexo = 'M';

        studenty2.name = "samuca";
        studenty2.idade = 30;
        studenty2.sexo = 'M';

        impressora.imprimir(studenty);
        impressora.imprimir(studenty2);

        System.out.println("#############################");

        impressora.imprimir(studenty);
        impressora.imprimir(studenty2);
    }
}
