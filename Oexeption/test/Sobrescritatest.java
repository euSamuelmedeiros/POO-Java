package Oexeption.test;

import Oexeption.domain.Funcionario;
//import Oexeption.domain.Pessoa;
import Oexeption.exeption.LoginInvalidoExeption;


public class Sobrescritatest {
    public static void main(String[] args) throws LoginInvalidoExeption {
        ////Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();


       
        funcionario.salvar();
        


         
    }
}
