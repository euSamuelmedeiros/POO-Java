package TreinoQualquer.test;

import TreinoQualquer.dominio.Cliente;
import TreinoQualquer.dominio.Vetrinario;

public class Clinica {
    public static void main(String[] args) {
        Vetrinario veterinario = new Vetrinario();
        veterinario.setName("Dr afonso");
        veterinario.setTel("99371-3728");
        veterinario.setEspecialidade("cirurgia");

        Cliente cliente = new Cliente();
        cliente.setName("Roberto");
        cliente.setTel("44930-2845");
        cliente.setNameOfpet("Apolo");

        System.out.println("Dados do veterinario:");
        veterinario.imprimeAieMeo();
        System.out.println("---------------");

        System.out.println("Dados do cliente:");
        cliente.imprimeAieMeo();
        
    }
}
