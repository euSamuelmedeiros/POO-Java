package Ycolecoes.Test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("samuel");
        names.add("ola mundo");
        names.add("Medeiros");
        names.remove("samuel"); // remove dados

        for (Object nome : names) {
            System.out.println(nome);
        }

        System.out.println("---------");
        int size = names.size();
        for (int i = 0; i < size; i++) {
            System.out.println(names.get(i));

        }

        System.out.println("---------");
        System.out.println("List of integers: ");
        // list of integers, primitive type

        List<Integer> numeros = new ArrayList(); //Integer type primitive (Int)
        numeros.add(3);
        numeros.add(7);
        numeros.add(100);

        for (Integer number : numeros) {
            System.out.println(number);
        }
        System.out.println("--------");
        List<String> list = new ArrayList();
        list.add("ola");

        for (String li: list){
            System.out.println(li);
        }
    }
}
