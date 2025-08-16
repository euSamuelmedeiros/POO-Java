package Oexeption.test;

public class treino02 {
    public static void main(String[] args) {
        try{
            validarSenha("17239");
        }catch (IllegalArgumentException e) {
            e.printStackTrace(); 
        }
        System.out.println("Codigo finalizado");
    }

    private static void validarSenha(String senha) throws  IllegalArgumentException {
        if(senha == null || senha.length() < 8){
            throw new IllegalArgumentException("Senha invalida, tem que ter no minimo 8 numeros. " + senha);
        }
        System.out.println("Senha cadastrada com sucesso." + senha);
    }
}
