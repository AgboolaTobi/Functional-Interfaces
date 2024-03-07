package chapter17FunctionalInterfaces;

import java.util.function.BinaryOperator;

public class BinaryOperatorSample {
    public static void main(String[] args) {
        BinaryOperator<String> binaryOperator = (word,letter)-> new StringBuilder(word).reverse().toString().concat(letter);
        System.out.println(binaryOperator.apply("toby", "agb"));
    }
}
