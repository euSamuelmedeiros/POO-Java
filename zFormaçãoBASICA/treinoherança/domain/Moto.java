package zFormaçãoBASICA.treinoherança.domain;

public class Moto extends Veiculo{
    private int cilindradas;
    private final static double  VALOR_BASE = 2000;



    public Moto(String marca, String modelo, int ano, int cilindradas) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;

    }

    @Override
    public double calcularImposto() {
        return VALOR_BASE * 00.2;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "cilindradas=" + cilindradas +
                '}';
    }
}
