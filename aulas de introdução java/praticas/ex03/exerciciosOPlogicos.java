package Treino.ex03;

import java.util.Scanner;

public class exerciciosOPlogicos {
    public static void main(String[] args) {
        /*int age = 30;
        float wage = 3000f;
        boolean cleanname = true;
          
        boolean isemprestimoLiberado = age >=21 && wage >= 2000 && cleanname;
        String phrase = String.format("pude fazer emprestimo? %s ", isemprestimoLiberado);
        System.out.println(phrase);*/

     Scanner input = new Scanner(System.in);

     System.out.print("Qual é a sua idade? ");
     int age = input.nextInt();

     System.out.print("Qual é o seu salrio mensal? ");
     float wage = input.nextFloat();
     boolean nameclean = true;
     
     boolean isemprestimoLiberado = age >= 23 && wage >= 3000 && nameclean;
     String phrase = String.format("Emprestimo liberado? %b", isemprestimoLiberado);
     System.out.println(phrase);

    input.close();
    }
}
