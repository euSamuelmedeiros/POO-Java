package TreinoQualquer.dominio;

public class Pessoa {
    private String name;
    private String tel;

    public void imprimeAieMeo(){
        System.out.println(this.name);
        System.out.println(this.tel);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

}
