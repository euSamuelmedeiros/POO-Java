package Mpolimorfismo.serviço;

import Mpolimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio{
     @Override
    public void Salvar() {
      System.out.println("salvando em um arquivo");
    }
}
