package ZZEStreams.Zpratica;

public class Filme {
    private String nome;
    private int ano;
    private double nota;

    @Override
    public String toString() {
        return "Filme{" +
                "nome='" + nome + '\'' +
                ", ano=" + ano +
                ", nota=" + nota +
                '}';
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Filme(String nome, double nota, int ano) {
        this.nome = nome;
        this.nota = nota;
        this.ano = ano;
    }
}
