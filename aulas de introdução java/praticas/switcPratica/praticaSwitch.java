

//import java.util.Scanner;

public class praticaSwitch {

    public static void main(String[] args) {
        /*
         * byte day = 1;
         * switch (day) {
         * case 1:
         * System.out.println("segunda, ainda é começo de semana..");
         * break;
         * case 2:
         * System.out.println("ainda é terça feira...");
         * break;
         * case 3:
         * System.out.println("quarta, meio de semana...");
         * break;
         * case 4:
         * System.out.println("quinta, quase sexta...");
         * break;
         * case 5:
         * System.out.println("sextouu...");
         * break;
         * case 6:
         * System.out.println("sabadou, final de semana..");
         * break;
         * case 7:
         * System.out.println("domingo, primeiro dia da semana...");
         * break;
         * default:
         * System.out.println("opçao invalida...");
         * 
         * }
         * 
         * }
         */

        /*
         * Scanner input = new Scanner(System.in);
         * System.out.println("Digite um número de 1 a 7 para o dia da semana:");
         * byte theday = input.nextByte();
         * switch (theday) {
         * case 1:
         * System.out.println("segunda, ainda é começo de semana.. dia util");
         * break;
         * case 2:
         * System.out.println("ainda é terça feira... dia util");
         * break;
         * case 3:
         * System.out.println("quarta, meio de semana... dia util");
         * break;
         * case 4:
         * System.out.println("quinta, quase sexta porem dia util");
         * break;
         * case 5:
         * System.out.println("sextouu, ainda é um dia util");
         * break;
         * case 6:
         * System.out.println("sabadou, final de semana..");
         * break;
         * case 7:
         * System.out.println("domingo, final de semana");
         * break;
         * default:
         * System.out.println("opçao invalida");
         * 
         * }
         * 
         * input.close();
         * 
         * }
         */

        byte day = 1;
        switch (day) {
            case 1:
            case 7:
                System.out.println("fim de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("dias uteis");
                break;
            default:
                System.out.println("opçao invalida. tente navamente");
        }
        
    }


    

}
