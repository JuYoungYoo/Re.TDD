package com.juyoung.tddlotto.model;

import lombok.Getter;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

@Getter
public class NumberGenerator {

    private static List<Number> numbers;

    static {
        numbers = IntStream.range(Number.MIN, Number.MAX+1).mapToObj(Number::of).collect(Collectors.toList());
    }

    private NumberGenerator() {
        shuffle();
    }

    public static NumberGenerator of() {
        return new NumberGenerator();
    }

    private void shuffle() {
        Collections.shuffle(numbers);
    }

    public List<Number> peek(int count) {
        return numbers.stream().limit(count).collect(toList());
    }

    public Number peek() {
        return numbers.get(0);
    }

    public int size() {
        return numbers.size();
    }
}
