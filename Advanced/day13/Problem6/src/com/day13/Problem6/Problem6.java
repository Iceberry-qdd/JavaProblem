package com.day13.Problem6;

import java.util.stream.Stream;
import static java.lang.Math.abs;

public class Problem6 {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1, -2, -3, 4, -5);
        Stream<Integer> newIntegerStream = integerStream.map(integer -> abs(integer));
        newIntegerStream.forEach(System.out::println);
    }
}
