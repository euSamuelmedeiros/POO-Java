package treinoherança.domain;

public class Aluno extends Pessoa{
    private String matricula;

    public void imprimi(){
     super.imprimi();
     System.out.println(this.matricula);
       
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

}
