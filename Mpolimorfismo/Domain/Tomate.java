package Mpolimorfismo.Domain;

public class Tomate extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.10;
    public String DataDeValidade;

    public String getDataDeValidade() {
        return DataDeValidade;
    }

    public void setDataDeValidade(String dataDeValidade) {
        DataDeValidade = dataDeValidade;
    }

    public Tomate(String name, double valor) {
        super(name, valor);
    }

    @Override
    public double taxavel() {
        System.out.println("Calculando imposto do tomate...");
        return valor * IMPOSTO_POR_CENTO;
    }
}