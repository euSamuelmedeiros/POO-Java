package Ycolecoes.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(2);
        numbers.add(5);
        numbers.add(1);
        numbers.add(4);

        Collections.sort(numbers);
        System.out.println(Collections.binarySearch(numbers, 2));
    }
}
