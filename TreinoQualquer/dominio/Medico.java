package TreinoQualquer.dominio;

public class Medico {
    private String name;
    private Paciente[] pacientes;

    public Medico(String name) {
        this.name = name;
    }
    public Medico(String name, Paciente[] pacientes){
        this.name = name;
        this.pacientes = pacientes;
    }

    public void imprimeAiSabosta() {
        System.out.println(this.name);
        if (pacientes == null)
            return;
        for (Paciente pacientee : pacientes) {
            System.out.println(pacientee.getName());

        }
    }

    public void setPacientes(Paciente[] paciente) {
        this.pacientes = paciente;
    }

    public Paciente[] getPaciente() {
        return pacientes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
