package PraticaOrientaçaoAObjeto.dominio;

public class Mecanico {
    private String name;
    private mecanicoFusca fusca;

    public void impime(){
        System.out.println(this.name);
        if(fusca != null){
            System.out.println(fusca.getname());
        }
    }

    public void setfusca(mecanicoFusca fusca){
        this.fusca = fusca;
    }

    public mecanicoFusca getFusca(){
        return fusca;
    }

    public Mecanico(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    
    
}
