package chapter17FunctionalInterfaces;

import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class IntConsumerSample {
    public static void main(String[] args) {
        IntConsumer consumer = System.out::println;
        IntStream.rangeClosed(1,10).forEach(consumer);

    }
}
