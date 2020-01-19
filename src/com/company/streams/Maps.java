package com.company.streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Maps {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Neel", "Ria", "Rito", "Shubham");
        names.stream()
                .map(new Function<String, User>() {
                    @Override
                    public User apply(String s) {
                        return new User(s, 10);
                    }
                }).forEach(new Consumer<User>() {
                    @Override
                    public void accept(User user) {
                        System.out.println(user.getName());
                    }
                });

        OptionalInt maxAge = names.stream()
                .map(new Function<String, User>() {
                    @Override
                    public User apply(String s) {
                        return new User(s, 10);
                    }
                }).mapToInt(User::getAge)
                .max();
        System.out.println("Max age " +  maxAge);
    }


    static class User {
        private String name;
        private int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
