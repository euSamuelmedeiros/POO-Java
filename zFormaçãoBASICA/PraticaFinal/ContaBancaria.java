package zFormaçãoBASICA.PraticaFinal;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public final class ContaBancaria {
    private final int numeroConta;
    private double salario;

    public ContaBancaria(double salario) {
        this.numeroConta = ThreadLocalRandom.current().nextInt(1, 10000);
        this.salario = salario;

    }
    public final void depositar(double valor) {
        if (valor > 0) {
            salario += valor;
            System.out.println("deposito de " + valor + " realizado com sucesso");
        } else {
            System.out.println("valor invalido para deposito");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ContaBancaria bancaria = (ContaBancaria) o;
        return numeroConta == bancaria.numeroConta && Double.compare(salario, bancaria.salario) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroConta, salario);
    }

    public final void sacar(double valor) {
        if (valor > 0 && salario >= valor) {
            salario -= valor;
            System.out.println("Saque de " + valor + "realizado com sucesso");
        } else {
            System.out.println("saldo induficiente ou valor invalido");
        }
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSalario() {
        return salario;
    }
}
