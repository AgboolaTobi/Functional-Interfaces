package chapter17FunctionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorSample {
    public static void main(String[] args) {
        UnaryOperator<String> unaryOperator = (word)-> new StringBuilder(word).reverse().toString();
        System.out.println(unaryOperator.apply("Hello"));
    }
}
