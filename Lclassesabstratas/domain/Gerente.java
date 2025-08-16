package Lclassesabstratas.domain;

public class Gerente extends Employee {
    public Gerente(String name, double salario) {
        super(name, salario);
    }

     @Override
    public String toString() {
        return "Employee [name=" + name + ", salario=" + salario +  "]";
    }


}
