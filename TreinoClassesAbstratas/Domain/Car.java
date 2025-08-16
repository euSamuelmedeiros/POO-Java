package TreinoClassesAbstratas.Domain;

public class Car extends Veiculo{

    @Override
    public void Mover() {
       System.out.println("o Carro anda sobre quatro rodas");
    }

    public Car(String marca){
        super(marca);
    }
    
}
