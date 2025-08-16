package Ninterface.Domain;

public interface DataLoader {
   public abstract void load();

   default void checkPermission(){
    System.out.println("Fazendo checagem de permissao");
   }
}
