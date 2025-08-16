package Lclassesabstratas.domain;

public abstract class Employee extends Pessoa{
    protected String name;
    protected double salario;

    public Employee(String name, double salario) {
        this.name = name;
        this.salario = salario;
        CalcularBonus();
    }

    public void CalcularBonus() {
        this.salario = salario + salario * 0.1;
    }


    public void imprime(){
        System.out.println("imprimindo...");
    }
}
