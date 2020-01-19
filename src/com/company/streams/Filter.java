package com.company.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Filter {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Neel", "Ria", "Rito", "Shubham");
        names.stream()
            .filter(new Predicate<String>() {
                @Override
                public boolean test(String s) {
                    return !s.equals("Neel");
                }
            }).forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }


}
