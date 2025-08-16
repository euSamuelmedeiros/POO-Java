package Gassociação.dominio;

public class Seminario {
    private String name;
    private Aluno[] alunos;

    public Seminario(String name) {
        this.name = name;
    }

    public void setAlunos(Aluno[] alunos){
        this.alunos = alunos;
    }

    public Aluno[] getAlunos(){
        return alunos;
    }

    public void setname(String name) {
        this.name = name;

    }

    public String getname() {
        return name;
    }

}
