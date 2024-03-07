package chapter17FunctionalInterfaces;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierWithConsumer {

    public static void main(String[] args) {

       Consumer<Integer> consumer = System.out::println;
       Supplier<Integer> supplier = ()-> new Random().nextInt(2355);

       consumer.accept(supplier.get());
    }
}
