package TreinoQualquer.dominio;

public class Jogador {
    private String name;
    private Time time;

    public void impimeSabostaAi(){
        System.out.println(this.name);
        if(time != null){
            System.out.println(time.getName());
        }
    }

    public void setName(Time time){
        this.time = time;
    }

    public Time getTime(){
        return time;
    }

    public Jogador(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    
}
