package PraticaOrientaçaoAObjeto.dominio;

public class paises {
    private String name;

    public void imprimeeai(){
        System.out.println(this.name);
    }

    public paises(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getname(){
        return name;
    }
}
