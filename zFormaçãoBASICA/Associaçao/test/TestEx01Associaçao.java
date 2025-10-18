package zFormaçãoBASICA.Associaçao.test;

import zFormaçãoBASICA.Associaçao.Domain.Aluno;
import zFormaçãoBASICA.Associaçao.Domain.Professor;

public class TestEx01Associaçao {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Samuel Medeiros");
        Professor professor = new Professor("Yamada");

        aluno.estudar(professor);

    }
}
