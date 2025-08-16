package Oexeption.test;

public class RuntimeExpitionTest03 {
    public static void main(String[] args) {
        abreConexao();
    }

    private static String abreConexao() {
        try {
            System.out.println("abrindo um arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "conexao aberta";
            
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            System.out.println("fechando recurso liberado pelo SO");
        }

        return null;
    }
}
