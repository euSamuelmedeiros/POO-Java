

public class Estudos {
    public static void main(String[] args){
        String name = "Carlos";
        int year = 17;
        double salario = 5200.75;
        String frase = String.format("O funcionario %s, com %d anos, atua como desenvolvedor de sistemas e recebe um salario de R$ %.2f", name, year, salario);
        System.out.println(frase); 
        
        // exercicio 02
        String date = "30/03/2027";
        String hours = "14:30";
        var sentence = String.format("Reuniao marcada com a maria luiza no dia %s as %s na minha casa kkk", date, hours);
        System.out.println(sentence); 

        
    }
   }  
