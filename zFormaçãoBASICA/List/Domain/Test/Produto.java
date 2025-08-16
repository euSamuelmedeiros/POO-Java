package zFormaçãoBASICA.List.Domain.Test;

public class Produto  implements Comparable<Produto>{
    private String name;
    private  double valor;

    @Override
    public String toString() {
        return "Produto{" +
                "name='" + name + '\'' +
                ", valor=" + valor +
                '}';
    }

    public Produto(String name, double valor) {
        this.name = name;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Produto o) {
        return this.name.compareToIgnoreCase(o.name);
    }
}
//Enunciado:
//Crie uma classe Produto com os atributos:
//
//nome (String)
//
//preco (double)
//
//Implemente Comparable<Produto> para que a lista de produtos seja ordenada pelo nome em ordem alfabética.
//No main, crie uma lista com 4 produtos, adicione valores, ordene usando Collections.sort(lista) e exiba.