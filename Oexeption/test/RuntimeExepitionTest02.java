package Oexeption.test;

public class RuntimeExepitionTest02 {
    public static void main(String[] args) {
        try {
            divi(1, 0);
        } catch (RuntimeException e) {    // try e catch --> tratamento de exeçao
            e.printStackTrace();
        }
        System.out.println("Codigo finalizado.");
    }

    private static int divi(int a, int b) {
        if (b == 0) {
            throw new RuntimeException("Argumento ilegal, nao pode ser por 0");
        }
        return a / b;
    }
}