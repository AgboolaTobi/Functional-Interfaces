package chapter17FunctionalInterfaces;

import java.util.Random;

import java.util.function.Supplier;

public class SupplierSample1 {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> {
            return new Random().nextInt(); // the bound can be put in the nextInt(). Also,the return is not necessary,and the curly braces
        };
        System.out.println(supplier.get());

    }
}
