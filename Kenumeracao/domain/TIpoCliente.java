package Kenumeracao.domain;

public enum TIpoCliente {
    PESSOA_FISICA(1),
    PESSOA_JURIDICA(2);
    private final int VALOR;

    TIpoCliente(int valor){
        this.VALOR = valor;
        System.out.println(VALOR);

    }
}
