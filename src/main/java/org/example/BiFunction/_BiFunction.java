package org.example.BiFunction;

import java.util.function.BiFunction;

public class _BiFunction {

    public static void main(String[] args) {
        System.out.println(addNumberAndMultiply.apply(4,10));
    }

    static BiFunction<Integer, Integer, Integer> addNumberAndMultiply = (addNum, multiplywith) ->  (addNum + 1) * multiplywith;
}
