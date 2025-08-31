package zFormaçãoBASICA.treinoherança.domain;

public class FuncionarioMensalista extends Funcionario {

    private double salarioMensal;

    public FuncionarioMensalista(String name, double salarioMensal) {
        super(name);
        this.salarioMensal = salarioMensal;
    }

    @Override
    public String toString() {
        return "FuncionarioMensalista{" +
                "salarioMensal=" + salarioMensal +
                '}';
    }

    @Override
    public double calcularSalario() {
        return 5000;
    }
}
