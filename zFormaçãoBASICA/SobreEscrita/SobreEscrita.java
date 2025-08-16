package zFormaçãoBASICA.SobreEscrita;

public class SobreEscrita {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SobreEscrita(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return"sobrescrita: " +  this.name;
    }
}
