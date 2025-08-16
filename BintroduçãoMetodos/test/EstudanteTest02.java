package BintroduçãoMetodos.test;

import BintroduçãoMetodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante studenty = new Estudante(); // ---> criação de objeto
        Estudante studenty2 = new Estudante(); // ---> criação de objeto

        studenty.name = "goku";
        studenty.idade = 49;
        studenty.sexo = 'M';

        System.out.println("------------------------");

        studenty2.name = "samuca";
        studenty2.idade = 30;
        studenty2.sexo = 'M';

         studenty.imprime();
         studenty2.imprime();

    }

}
