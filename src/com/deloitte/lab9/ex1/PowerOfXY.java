package com.deloitte.lab9.ex1;

import java.util.function.*;

public class PowerOfXY {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> power = (x, y) -> x * y;

        int result = power.apply(5, 10);
        System.out.println("Result: " + result);
    }
}