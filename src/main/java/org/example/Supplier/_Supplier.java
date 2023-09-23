package org.example.Supplier;

import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(databaseURL.get());
    }

    static Supplier<String> databaseURL = () -> "jdbc://localhost:5432/users";
}
