package TreinoQualquer.dominio;



public class Paciente {
    private String name;

    public Paciente(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    
}
