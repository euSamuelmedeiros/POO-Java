package Oexeption.exeption;

import java.util.Scanner;

//import java.util.Scanner;

public class LoginInvalidoExeptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoExeption e) {
            e.printStackTrace();
        }
    }

    public static void logar() throws LoginInvalidoExeption {
        Scanner sc = new Scanner(System.in);
        String usuario = "Goku";
        String senha = "ssj";

        System.out.print("Usuário: ");
        String digitadoUsuario = sc.nextLine();

        System.out.print("Senha: ");
        String digitadoSenha = sc.nextLine();

        if (!usuario.equals(digitadoUsuario) || !senha.equals(digitadoSenha)) {
            throw new LoginInvalidoExeption("Usuário ou senha inválidos");
        }
        System.out.println("usuario logado com sucesso.");
System.out.println(sc);
    }

}
