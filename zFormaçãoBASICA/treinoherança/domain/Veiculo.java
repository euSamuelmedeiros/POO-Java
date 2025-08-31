package zFormaçãoBASICA.treinoherança.domain;

public abstract class Veiculo {

    protected String Marca;
    protected  String Modelo;
    protected  int Ano;

    public abstract double calcularImposto();


    @Override
    public String toString() {
        return "Veiculo{" +
                "Marca='" + Marca + '\'' +
                ", Modelo='" + Modelo + '\'' +
                ", Ano=" + Ano +
                '}';
    }

    public Veiculo(String marca, String modelo, int ano) {
        Marca = marca;
        Modelo = modelo;
        Ano = ano;
    }
}
