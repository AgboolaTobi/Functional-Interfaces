package chapter17FunctionalInterfaces;

import java.util.function.Consumer;

public class ConsumerSample1 {
    public static void main(String[] args) {
        Consumer<String> consumer = (word)->{
            System.out.println( word + " is a great guy.");
        };
        consumer.accept("Toby");

        Consumer<Boolean> consumer1 = (value)->{
            System.out.println(value);
        };
        consumer1.accept(true);


    }
}
