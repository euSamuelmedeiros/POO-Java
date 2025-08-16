package Gassociação.dominio;

public class Jogador {
    private String name;
    private Time time;

    public void impime() {
        System.out.println(this.name);
        if (time != null) {
            System.out.println(time.getName());
        }
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Time getTime() {
        return time;

    }

    public Jogador(String name) {
        this.name = name;
    }

    public String getname() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
