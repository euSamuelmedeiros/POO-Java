package PraticaOrientaçaoAObjeto.dominio;

public class continentes {
    private String name;

    public void imprimeAiBagaça(){
        System.out.println(this.name);
    }

    public continentes(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getname(){
        return name;
    }
    
}
