package TreinoQualquer.dominio;

public class Vetrinario extends Pessoa {
    private String especialidade;

    public void imprimeAieMeo() {
        super.imprimeAieMeo();
        System.out.println("Especialidae: " + especialidade);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

}
