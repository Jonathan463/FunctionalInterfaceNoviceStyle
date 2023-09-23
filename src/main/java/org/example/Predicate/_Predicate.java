package org.example.Predicate;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {
        System.out.println(validateNumber.test("08030496039"));
    }
   static Predicate<String> validateNumber = number -> number.startsWith("08") && number.contains("3");
}
