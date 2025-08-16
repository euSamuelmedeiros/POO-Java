package zFormaçãoBASICA.PraticaLIst.Test;

import zFormaçãoBASICA.PraticaLIst.Domian.Aluno;

import java.util.ArrayList;
import java.util.List;

public class AlunoTest01 {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();

        System.out.println("All students: ");
        alunos.add(new Aluno("Samuel", 9.0));
        alunos.add(new Aluno("sergio", 4.8));
        alunos.add(new Aluno("maria luiza", 10.0));
        alunos.add(new Aluno("arthur", 7.0));
        alunos.add(new Aluno("Pedro", 6.0));

        for (Aluno a : alunos) {
            System.out.println(a);
        }
        System.out.println("-----------------------------------");

        System.out.println("approved students: ");
        for (Aluno a : alunos) {
            if (a.getNota() >= 7) {
                System.out.println(a);
            }

        }
        System.out.println("--------------------------------------");
        alunos.removeIf(a -> a.getName().equals("sergio"));

        System.out.println("list updated: ");

        for (Aluno a : alunos) {
            System.out.println(a);
        }
    }
}
