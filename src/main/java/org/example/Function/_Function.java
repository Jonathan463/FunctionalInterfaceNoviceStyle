 package org.example.Function;

 import java.util.function.Function;

 public class _Function {
    public static void main(String[] args) {
        System.out.println(increment(200));
        Integer result = incrementByOne.apply(200 );

        Integer multiply = multiplyBy10.apply(result);
        System.out.println(multiply);

        System.out.println(result);

        System.out.println("Length of result "+numberToString.apply(result));

        //Chaining result with andThen
        Function<Integer, String> multiplyBy10AndThenToString = multiplyBy10.andThen(numberToString);
        System.out.println("AndThen Value "+multiplyBy10AndThenToString.apply(3));

    }
    //Imperative approach
    static int increment(int number){
        return number + 1;
    }

    //Declarative approach
    static Function<Integer, Integer> incrementByOne = number -> number + 1;

    static Function<Integer, String> numberToString = number -> String.valueOf(number.toString().length());

    static Function<Integer,Integer> multiplyBy10 = number -> number * 10;
}
