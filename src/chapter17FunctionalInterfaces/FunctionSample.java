package chapter17FunctionalInterfaces;

import java.util.function.Function;

public class FunctionSample {
    public static void main(String[] args) {
        Function<String,Integer> function = (check)->check.length();
        System.out.println(function.apply("Girl"));

        Function<String,String> function1 = (word)->word.substring(4);
        System.out.println(function1.apply("communication"));
    }
}
