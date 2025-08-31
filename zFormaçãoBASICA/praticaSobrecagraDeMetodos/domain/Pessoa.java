package zFormaçãoBASICA.praticaSobrecagraDeMetodos.domain;


//Crie a classe Pessoa que pode ser criada de várias formas (sobrecarga de construtores):
//
//Pessoa(String nome) → cria a pessoa apenas com o nome.
//
//Pessoa(String nome, int idade) → cria a pessoa com nome e idade.
//
//Pessoa(String nome, int idade, String profissao) → cria a pessoa com nome, idade e profissão.
//
//        No main, crie objetos com cada construtor e mostre os dados.
public class Pessoa {
    private String name;
    private int idade;
    private String profissao;

    public Pessoa(String name) {
        this.name = name;
    }

    public  Pessoa(String name, int idade){
        this.idade = idade;
        this.name = name;

    }

    public Pessoa(String name, int idade, String profissao){
        this.name = name;
        this.idade = idade;
        this.profissao = profissao;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "name='" + name + '\'' +
                ", idade=" + idade +
                ", profissao='" + profissao + '\'' +
                '}';
    }
}
