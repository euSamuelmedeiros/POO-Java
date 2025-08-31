package zFormaçãoBASICA.treinoherança.domain;

public class Carro extends Veiculo{

    private int numeroDePortas;
    private static final double VALOR_BASE = 50000.0;

    public Carro(String marca, String modelo, int ano, int numeroDePortas) {
        super(marca, modelo, ano);
        this.numeroDePortas = numeroDePortas;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "numeroDePortas=" + numeroDePortas +
                '}';
    }

    @Override
    public double calcularImposto() {
        return VALOR_BASE * 00.4;
    }
}
