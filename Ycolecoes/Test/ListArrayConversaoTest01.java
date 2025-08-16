package Ycolecoes.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConversaoTest01 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);                                   // trasnformando List em Array
        Integer[] ListToAray = numbers.toArray(new Integer[0]);
        System.out.println(Arrays.toString(ListToAray));

        System.out.println("-------------");

        Integer[] numbersArray = new Integer[3];

        numbersArray[0] = 1;
        numbersArray[1] = 2;
        numbersArray[2] = 3;

        List<Integer> integerList = Arrays.asList(numbersArray);
        integerList.set(0, 12); // mudando a o local 0 do array para 12.
        System.out.println(Arrays.toString(numbersArray));
        System.out.println(integerList);
    }
}
