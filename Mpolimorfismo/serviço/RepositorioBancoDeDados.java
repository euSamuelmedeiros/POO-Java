package Mpolimorfismo.serviço;

import Mpolimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void Salvar() {
        System.out.println("salvando em banco de dados");
    }
}
