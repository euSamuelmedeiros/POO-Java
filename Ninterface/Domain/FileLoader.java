package Ninterface.Domain;

public class FileLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("carregando dados de um arquivo....");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados de um arquivo...");
    }

    @Override
    public void checkPermission() {
        System.out.println("checando permissao de arquivos");
    }

}
