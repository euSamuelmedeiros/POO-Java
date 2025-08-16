package Mpolimorfismo.Domain;

public class Televisao extends Produto {
public static final double IMPOSTO_POR_CENTO = 0.10;
    @Override
    public double taxavel() {
       System.out.println("calculando imposto da televisao");
       return this.valor * IMPOSTO_POR_CENTO;
    }

    public Televisao(String name, double valor){
        super(name, valor);
    }

    
    
}
