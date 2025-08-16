package zFormaçãoBASICA.praticaString;

public class StringTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatStringBuilder(100_0000);
        long fim = System.currentTimeMillis();
        System.out.println("o tempo gasto para StringBuilder é " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(100_000);
        fim = System.currentTimeMillis();
        System.out.println("tempo gasto para StringBuffer é " + (fim - inicio) + "ms");

    }

    public static void concatStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);

        }
    }

    public static void concatStringBuffer(int tamanho) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);

        }
    }

}
