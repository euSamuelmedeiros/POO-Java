package BintroduçãoMetodos.dominio;

public class impressoraEstudante {
    public void imprimir(Estudante estudante) {
        System.out.println("-------------------------");

        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante.name);

        estudante.name = "goham";


    }

}
