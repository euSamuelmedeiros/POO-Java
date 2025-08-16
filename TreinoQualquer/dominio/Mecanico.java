package TreinoQualquer.dominio;

public class Mecanico {
    private String name;
    private ClientMec[] clientes;

    public Mecanico(String name) {
        this.name = name;
    }

    public Mecanico(String name, ClientMec[] clientes) {
        this.name = name;
        this.clientes = clientes;
    }

    public void imprimeAiAmigo() {
        System.out.println(this.name);
        if (clientes == null)
            return;
        for (ClientMec clientee : clientes) {
            System.out.println(clientee.getName());

        }
    }
    public void setClientes(ClientMec[] clietes) {
        this.clientes = clietes;
    }

    public ClientMec[] getClientes() {
        return clientes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
