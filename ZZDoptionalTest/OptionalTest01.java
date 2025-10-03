package ZZDoptionalTest;

import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> string = Optional.ofNullable(null);
        System.out.println(string);


    }

}
