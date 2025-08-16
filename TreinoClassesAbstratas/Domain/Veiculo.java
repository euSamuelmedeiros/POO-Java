package TreinoClassesAbstratas.Domain;

public abstract class Veiculo {
    String marca;

    public Veiculo(String marca) {
        this.marca = marca;
    }

    public void exibirMarca(){
        System.out.println("Marca" +marca);
    }

    public abstract void Mover();

}
