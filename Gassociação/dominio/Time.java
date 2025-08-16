package Gassociação.dominio;

public class Time {
    private String name;
    private Jogador[] jogador;

    public Time(String name) {
        this.name = name;
    }

    public Time(String name, Jogador[] jogador) {
        this.name = name;
        this.jogador = jogador;
    }

    public void impime() {
        System.out.println(this.name);
        if (jogador == null)
            return;
        for (Jogador jogador2 : jogador) {
            System.out.println(jogador2.getname());

        }
    }

    public void setJogador(Jogador[] jogador) {
        this.jogador = jogador;
    }

    public Jogador[] getJogado() {
        return jogador;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
 