package aula04;

public class OPlogicos {
    public static void main(String[] args){
        // && (AND) ---> E
    // || (or) ---> ou
        int age = 35;
        float wage = 3500f;
        boolean isDentroDaLei = age > 30 && wage >= 4612;
        boolean isDentroDaLeiMenor = age < 30 && wage >= 3361;
        System.out.println(isDentroDaLei);
        System.out.println(isDentroDaLeiMenor);

        double currentaccount = 300;
        double savingsaccount = 10000;
        float Ps5 = 5000;
        boolean isPs5Compravel = currentaccount > Ps5 || savingsaccount > Ps5;
        String phrase = String.format("O video game pode ser comprado %b", isPs5Compravel);
        System.out.println(phrase);


        // Operadores de atribuição:
        // = += -= *= /= %=

        double bonus = 1800; //1800
        bonus += 1000;// 2800
        bonus -= 1800; // 1000
        bonus *= 2;
        bonus /= 2;
        System.out.println(bonus);


        int contador = 1;
        contador += 1;
        contador++;
        System.out.println(contador);
       

    }
    
    
 }   
