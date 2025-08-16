package introduçãoJavaClasses.test;

import introduçãoJavaClasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.idade = 21;
        estudante.name = "samuca";
        estudante.sexo = 'M';
        
        System.out.println(estudante.name);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

    }
}
