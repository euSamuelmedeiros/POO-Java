package Mpolimorfismo.serviço;

import Mpolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {

    @Override
    public void Salvar() {
      System.out.println("salvando em Memoria");
    }
    
}
