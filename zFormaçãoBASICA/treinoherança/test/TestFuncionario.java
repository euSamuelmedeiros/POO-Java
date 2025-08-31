package zFormaçãoBASICA.treinoherança.test;

import zFormaçãoBASICA.treinoherança.domain.Funcionario;
import zFormaçãoBASICA.treinoherança.domain.FuncionarioHorista;
import zFormaçãoBASICA.treinoherança.domain.FuncionarioMensalista;

import java.util.ArrayList;
import java.util.List;

public class TestFuncionario {
    public static void main(String[] args) {
        List<Funcionario> funcionarioList = new ArrayList<>();

        funcionarioList.add(new FuncionarioHorista("Samuel ", 40, 100));
        funcionarioList.add(new FuncionarioMensalista("Felipe" , 3000));
        funcionarioList.add(new FuncionarioHorista("Carlos", 50, 30));
        funcionarioList.add(new FuncionarioMensalista("bruno" , 4000));

        for (Funcionario funcionario : funcionarioList) {
            System.out.println(funcionario);
            System.out.printf("Salário: R$ %.2f%n", funcionario.calcularSalario());
            System.out.println("---------------------------");
        }

    }
}
