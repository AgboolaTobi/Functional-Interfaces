package chapter17FunctionalInterfaces;

import java.util.function.BiPredicate;

public class BiPredicateSample1 {
    public static void main(String[] args) {
        BiPredicate<String, String> biPredicate = (word1, word2)->word1.length() > word2.length();
        System.out.println(biPredicate.test("python", "java"));
    }
}
