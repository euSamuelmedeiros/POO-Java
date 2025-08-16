package Mpolimorfismo.Domain;

public class Computador extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.21;

    public Computador(String name, double valor) {
        super(name, valor);
    }

    @Override
    public double taxavel() {
        System.out.println("Calculando imposto do computador...");
        return valor * IMPOSTO_POR_CENTO;
    }
}