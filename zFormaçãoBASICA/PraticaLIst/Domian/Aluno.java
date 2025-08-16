package zFormaçãoBASICA.PraticaLIst.Domian;

public class Aluno {
    private  String name;
    private  double nota;

    @Override
    public String toString() {
        return "Aluno{" +
                "name='" + name + '\'' +
                ", nota=" + nota +
                '}';
    }

    public Aluno(String name, double nota) {
        this.name = name;
        this.nota = nota;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
//Tenha uma classe Aluno com os atributos: nome (String) e nota (double).
//
//No main, crie uma List<Aluno> e adicione 5 alunos com nomes e notas diferentes.
//
//Mostre todos os alunos usando for-each.
//
//Mostre apenas os alunos que têm nota maior ou igual a 7.
//
//Remova um aluno pelo nome e mostre a lista novamente.
//
//Código exemplo