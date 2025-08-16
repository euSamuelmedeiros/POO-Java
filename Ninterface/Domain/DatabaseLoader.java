package Ninterface.Domain;

public class DatabaseLoader implements DataLoader, DataRemover{
    @Override
    public void load(){
        System.out.println("carregando dados do banco de dados...");
    }

    @Override
    public void remove() {
    System.out.println("Removendo dados do banco de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("checando permissao do banco de dados");
    }
    
    
}
