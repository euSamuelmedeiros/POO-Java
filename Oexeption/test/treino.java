package Oexeption.test;

public class treino {
    public static void main(String[] args) {
        try {
            cadastrarIdade(-3);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        System.out.println("codigp finalizado.");
    }

    private static void cadastrarIdade(int idade) {
        if (idade < 0 || idade > 130) {
            throw new IllegalArgumentException("Idade invalida " + idade);
        }
        System.out.println("Idade cadatrada com sucesso " + idade);
    }
}   