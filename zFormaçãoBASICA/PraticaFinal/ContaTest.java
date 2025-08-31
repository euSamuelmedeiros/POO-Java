package zFormaçãoBASICA.PraticaFinal;

public class ContaTest {
    public static void main(String[] args) {
        ContaBancaria bancaria = new ContaBancaria(1000.8);

        System.out.println("Numero da conta: " + bancaria.getNumeroConta());
        System.out.println("Saldo atual da conta: " + bancaria.getSalario());

        System.out.println("-----------------------");

        bancaria.depositar(500.50);
        System.out.println("saldo da conta dps do deposito: " + bancaria.getSalario());

        System.out.println("-----------------------");

        bancaria.sacar(400);
        System.out.println("saldo da conta logo apos o saque " + bancaria.getSalario());
    }
}
