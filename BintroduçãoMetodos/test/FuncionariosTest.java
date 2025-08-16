package BintroduçãoMetodos.test;

import BintroduçãoMetodos.dominio.Funcionario;

public class FuncionariosTest {
    public static void main(String[] args) {
        Funcionario employees = new Funcionario();

        employees.setName("roberto");
        employees.setAge(34);
        employees.setWage(new double[]{1200, 987.23, 2000});
    
        employees.imprimee();
        System.out.println("media " + employees.getMedia());
        

    }
}
