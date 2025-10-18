package zFormaçãoBASICA.Associaçao.test;

import zFormaçãoBASICA.Associaçao.Domain.Aluno;
import zFormaçãoBASICA.Associaçao.Domain.Departamento;
import zFormaçãoBASICA.Associaçao.Domain.Funcionario;
import zFormaçãoBASICA.Associaçao.Domain.Professor;

public class TestEx02Associaçao {
    public static void main(String[] args) {
        Departamento departamento = new Departamento("Montagem");

        Funcionario funcionario1 = new Funcionario("Rogerio", departamento);
        Funcionario funcionario2 = new Funcionario("Rodrigo", departamento);
        Funcionario funcionario3 = new Funcionario("Fabricio", departamento);

        System.out.println(funcionario1);;
        System.out.println(funcionario2);;
        System.out.println(funcionario3);;
    }
}
