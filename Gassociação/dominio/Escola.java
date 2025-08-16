package Gassociação.dominio;

public class Escola {
    private String name;
    private Professor[] professores;

    public Escola(String name) {
        this.name = name;
    }

    public Escola(String name, Professor[] professores) {
        this.name = name;
        this.professores = professores;
    }

    public void imprimeAi() {
        System.out.println(this.name);
        if (professores == null)
            return;
        for (Professor professor : professores) {
            System.out.println(professor.getName());
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }

    public Professor[] getProfessors() {
        return professores;
    }

}
