package chapter17FunctionalInterfaces;

import java.util.function.BiConsumer;

public class BiConsumerSample {
    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (name, state)->{
            System.out.println("Name is " + name + " and " + " I am from  " + state);
        };
        biConsumer.accept("Shola","Osun");
    }

}
