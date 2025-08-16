package Oexeption.domain;

import Oexeption.exeption.LoginInvalidoExeption;

public class Funcionario extends Pessoa {
    public void salvar() throws LoginInvalidoExeption {
        System.out.println("Salvando funcionario.");
    }

}
