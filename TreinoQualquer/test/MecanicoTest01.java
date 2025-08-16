package TreinoQualquer.test;

import TreinoQualquer.dominio.ClientMec;
import TreinoQualquer.dominio.Mecanico;

public class MecanicoTest01 {
    public static void main(String[] args) {
        ClientMec client1 = new ClientMec("rogerio");
        ClientMec client2 = new ClientMec("marcio");
        ClientMec[] clientes = { client1, client2 };
        Mecanico mec = new Mecanico("Mecanica almeida", clientes);

        mec.imprimeAiAmigo();

    }

}
