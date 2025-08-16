package Kenumeracao.domain;

public class Cliente {
public enum tipoPagamento {
        DEBITO, CREDITO
    }

    private String name;
    private TIpoCliente tipoCliente;
    private tipoPagamento tiPagamento;
     

    public Cliente(String name, TIpoCliente tipoCliente, tipoPagamento tiPagamento) {
        this.name = name;
        this.tipoCliente = tipoCliente;
        this.tiPagamento = tiPagamento;
    }

    @Override
    public String toString() {
        return "Cliente [name=" + name + ", tipoCliente.VALOR=" + tipoCliente + ", tiPagamento=" + tiPagamento + ", tipoCliente.VALOR=]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TIpoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TIpoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public tipoPagamento getTiPagamento() {
        return tiPagamento;
    }

    public void setTiPagamento(tipoPagamento tiPagamento) {
        this.tiPagamento = tiPagamento;
    }
}