package introduçãoJavaClasses.test;

import introduçãoJavaClasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.name = "alex";
        professor.sex = 50;
        professor.age = 'M';

        System.out.println(professor.age + " "+professor.name+ " "+professor.sex);

    }
}
