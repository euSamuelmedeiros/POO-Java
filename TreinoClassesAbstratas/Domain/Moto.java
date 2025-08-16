package TreinoClassesAbstratas.Domain;

public class Moto extends Veiculo{

    @Override
    public void Mover() {
    System.out.println("A moto anda sobre 2 rodas");
    }

    public Moto(String marca){
        super(marca);
    }
    
}
