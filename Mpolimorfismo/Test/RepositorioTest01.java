package Mpolimorfismo.Test;

import Mpolimorfismo.repositorio.Repositorio;
import Mpolimorfismo.serviço.RepositorioBancoDeDados;

public class RepositorioTest01 {
    public static void main(String[] args) {
       Repositorio repositorio= new RepositorioBancoDeDados();
        repositorio.Salvar();
    }
}
