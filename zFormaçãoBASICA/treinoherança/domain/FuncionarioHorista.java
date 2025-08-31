package zFormaçãoBASICA.treinoherança.domain;

public class FuncionarioHorista extends Funcionario {

    private double horasTrabalhadas;
    private  double valorPOrHora;

    public FuncionarioHorista(String name,  double horasTrabalhadas, double valorPOrHora) {
        super(name);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPOrHora = valorPOrHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabalhadas * valorPOrHora;
    }
}
