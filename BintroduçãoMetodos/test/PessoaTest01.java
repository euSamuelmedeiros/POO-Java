package BintroduçãoMetodos.test;

import BintroduçãoMetodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa person = new Pessoa();

        person.setName("Vegeta");
        person.setAge(50);
        person.setWage(30000);
        person.setAddress("rua algusto batista");

        person.imprime(); //----> para imprimir tudo
       // System.out.println(person.getAge());
      // System.out.println(person.getName());



    }
}
