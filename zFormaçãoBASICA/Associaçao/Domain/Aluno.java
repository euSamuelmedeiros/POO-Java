package zFormaçãoBASICA.Associaçao.Domain;

import javax.swing.*;

public class Aluno {
    private String name;

    public Aluno(String name) {
        this.name = name;
    }
    public void estudar(Professor professor) {
        System.out.println("O aluno "+ name + " Esta tendo aulas praticas de java avançado com o professor " + professor.getName());
    }
}
