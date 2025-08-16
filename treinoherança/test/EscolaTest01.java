package treinoherança.test;

import treinoherança.domain.Aluno;
import treinoherança.domain.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setName("pedro");
        aluno.setAge(17);
        aluno.setMatricula("299329");

        aluno.imprimi();

        Professor prof = new Professor();
        prof.setName("Laura");
        prof.setAge(57);
        prof.setSalario(30000);
        System.out.println("-------------");
        prof.imprimi();

    }

}
