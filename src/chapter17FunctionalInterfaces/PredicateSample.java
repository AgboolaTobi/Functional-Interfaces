package chapter17FunctionalInterfaces;

import java.util.function.Predicate;

public class PredicateSample {
    public static void main(String[] args) {
        Predicate<String> predicate = (word)->(word.length() > 2);
        boolean result = predicate.test("NO");
        System.out.println(result);
        System.out.println(predicate.test("And"));
    }
}
