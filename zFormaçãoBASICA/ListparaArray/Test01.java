package zFormaçãoBASICA.ListparaArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();

        integerList.add(3);
        integerList.add(1);
        integerList.add(2);
        integerList.add(4);

        Integer[] array = integerList.toArray(new Integer[0]);
        System.out.println(Arrays.toString(array));


    }

}

