package ZZprojetosSimples.CatalogoDeFilmes.Domain;

public class Filme {
    private String titulo;
    private String diretor;
    private GeneroFilmeProjeto genero;
    private  int ano;
    private double nota;

    public Filme(String titulo, int ano, GeneroFilmeProjeto genero, String diretor, double nota) {
        this.titulo = titulo;
        this.ano = ano;
        this.genero = genero;
        this.diretor = diretor;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "titulo='" + titulo + '\'' +
                ", diretor='" + diretor + '\'' +
                ", genero=" + genero +
                ", ano=" + ano +
                ", nota=" + nota +
                '}';
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }


    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
}
