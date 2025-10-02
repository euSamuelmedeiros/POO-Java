package ZZCLambdasTest.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdasFunctionTest02 {
    public static void main(String[] args) {
        List<String> stringList = List.of("Samuel", "maria Luiza", "Felipe");
        List<Integer> integers = Map(stringList, String::length);
        List<String> stringUpper = Map(stringList, String::toUpperCase);
        List<String> sringLower = Map(stringList, String::toLowerCase);
        System.out.println(integers);
        System.out.println(stringUpper);
        System.out.println(sringLower);


    }

    private static <T, R> List<R> Map(List<T> list, Function<T, R> trFunction) {
        List<R> result = new ArrayList<>();
        for (T e : list) {
            R r = trFunction.apply(e);
            result.add(r);

        }


        return result;
    }
}
