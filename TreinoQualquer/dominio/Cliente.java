package TreinoQualquer.dominio;

public class Cliente extends Pessoa {
    private String nameOfpet;

    public void imprimeAieMeo() {
        super.imprimeAieMeo();
        System.out.println("Nome do pet: " + nameOfpet);
    }

    public String getNameOfpet() {
        return nameOfpet;
    }

    public void setNameOfpet(String nameOfpet) {
        this.nameOfpet = nameOfpet;
    }

}
