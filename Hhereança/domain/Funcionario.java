package Hhereança.domain;

public class Funcionario extends Pessoa {

    private double salario;

    public Funcionario(String name) {
        super(name);
    }

    public void imprimeai() {
        super.imprimeai();
        System.out.println(this.salario);
    }

    public void relatorioSalario() {
        System.out.println("eu" + this.name + "recebi o salario de: " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
