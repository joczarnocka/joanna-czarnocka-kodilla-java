package com.kodilla.stream.task;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Main {


    public static long getCountEmptyStringUsingJava8(List<String> strings) {

        return strings.stream().filter(String::isEmpty).count();
    }


    public static long getCountLength3UsingJava8(List<String> strings) {
        return strings.stream().filter(s -> (s.length() == 3)).count();
    }

    public static List<String> deleteEmptyStringsUsingJava8(List<String> strings) {

        return strings.stream()
                      .filter(s -> (! s.isEmpty()))
                      .collect(Collectors.toList());
    }


    public static String getMergedStringUsingJava8(List<String> strings, String s) {

        return strings.stream()
                      .filter(str -> (! str.isEmpty()))
                      .collect(Collectors.joining(s));
    }


    public static List<Integer> getSquaresJava8(List<Integer> numbers) {

        return numbers.stream()
                 .distinct()
                 .map(n -> n*n)
                 .collect(Collectors.toList());
    }


    public static Integer getMaxJava8(List<Integer> numbers) {

        OptionalInt maxI =  numbers.stream().mapToInt(I -> I).max();

        if (maxI.isPresent())
            return maxI.getAsInt();
        else
            return Integer.MAX_VALUE;
    }

    public static Integer getMinJava8(List<Integer> numbers) {
        OptionalInt minI =  numbers.stream().mapToInt(I -> I).min();
        return minI.orElse(Integer.MIN_VALUE);

        /*if (minI.isPresent())
            return minI.getAsInt();
        else
            return Integer.MIN_VALUE;*/
    }

    public static Integer getSumJava8(List<Integer> numbers) {

        return numbers.stream().mapToInt(I -> I).sum();
    }

    public static Integer getAverageJava8(List<Integer> numbers) {

        if (numbers.size() == 0)
            return 0;
        double avgD = numbers.stream().mapToInt(I -> I).average().orElse(0);
        return (int) avgD;
    }
}
