package ZZCLambdasTest.Test;

import java.util.List;
import java.util.function.Consumer;

public class LambdasConsumerTest01 {
    public static void main(String[] args) {
        List<String> stringList = List.of("Samuel", "maria luiza", "Felipe");
        For(stringList, (String s) -> System.out.println(s)); // Lambda
    }

    private static <T> void For(List<T> list, Consumer<T> tConsumer) {  //voltando aos estudos freneticos agora.
        for (T e : list) {
            tConsumer.accept(e);     //For generico, imprime td tipo de lista.
        }

    }
}
