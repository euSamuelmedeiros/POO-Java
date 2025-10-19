package ZZEStreams.Test;

import java.util.List;

public class StreamsReduce {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6);

       integerList.stream().reduce(Integer::sum).ifPresent(System.out::println);

    }
}
