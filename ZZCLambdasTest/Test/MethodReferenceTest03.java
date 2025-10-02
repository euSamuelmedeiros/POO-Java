package ZZCLambdasTest.Test;

import ZZCLambdasTest.Domain.Anime;

import java.util.List;
import java.util.function.BiFunction;

public class MethodReferenceTest03 {
    public static void main(String[] args) {
        List<String> stringList = List.of("Samuel", "Mariana,", "Luiz cesar");
        BiFunction<String, Integer, Anime> animeBiFunction = Anime::new;
        System.out.println(animeBiFunction.apply("DBZ", 200));
    }
}
