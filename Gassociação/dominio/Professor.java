package Gassociação.dominio;

public class Professor {
    private String name;
    private String especialidade;

    public Professor(String name) {
        this.name = name;
    }

    public Professor(String name, String especialidade) {
        this.name = name;
        this.especialidade = especialidade;
    }

    public void setEspecialidades(String especialidade){
        this.especialidade = especialidade;
    }

    public String getEspecialidade(){
        return especialidade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
