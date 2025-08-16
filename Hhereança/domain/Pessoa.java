package Hhereança.domain;

public class Pessoa {
    protected String name;
    protected String cpf;
    protected Endereço endereço;

    public Pessoa(String name){
        this.name = name;
    }

    public Pessoa(String name, String cpf){
        this(name);
        this.cpf = cpf;
    }

    public void imprimeai() {
        System.out.println(this.name);
        System.out.println(this.cpf);
        System.out.println(this.endereço.getRua() + " " + this.endereço.getCep());

    }

    public void setname(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setcpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setEndereço(Endereço endereço) {
        this.endereço = endereço;
    }

    public Endereço getEndereço() {
        return endereço;
    }

}
