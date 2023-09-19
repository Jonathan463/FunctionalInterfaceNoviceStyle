 package org.example.Function;

 import java.util.function.Function;

 public class _Function {
    public static void main(String[] args) {
        System.out.println(increment(2));
        Integer result = incrementByOne.apply(1);

        System.out.println(result);
    }
    //Imperative approach
    static int increment(int number){
        return number + 1;
    }

    //Declarative approach
    static Function<Integer, Integer> incrementByOne = number -> number + 1;
}
