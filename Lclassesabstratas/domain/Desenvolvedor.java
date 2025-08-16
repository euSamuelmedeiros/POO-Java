package Lclassesabstratas.domain;

public class Desenvolvedor extends Employee{
    
    public Desenvolvedor(String name, double salario){
        super(name, salario);

    }
 @Override
    public String toString() {
        return "Employee [name=" + name + ", salario=" + salario +  "]";
    }

}
