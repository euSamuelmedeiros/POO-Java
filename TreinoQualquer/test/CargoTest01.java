package TreinoQualquer.test;

import TreinoQualquer.dominio.Cargo;
import TreinoQualquer.dominio.Funcionario;

public class CargoTest01 {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("pedro", Cargo.GERENTE);
        Funcionario funcionario2 = new Funcionario("roberto", Cargo.ANALISTA);
        Funcionario funcionario3 = new Funcionario("augusto", Cargo.ESTAGIARIO);
        Funcionario funcionario4 = new Funcionario("arthur", Cargo.DESENVOLVEDOR);

        System.out.println( funcionario1);
        System.out.println(funcionario2);
        System.out.println(funcionario3);
        System.out.println(funcionario4);
    }

}
