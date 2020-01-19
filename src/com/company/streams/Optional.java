package com.company.streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.Consumer;
import java.util.function.Predicate;

import static java.util.Arrays.asList;

public class Optional {

    public static void main(String[] args) {
        List<String> names = asList("Neel", "Ria", "Rito", "Shubham");
        List<User> users = asList(
                new User("Neel", 10, new int[]{1, 2}),
                new User("Neel", 10, new int[]{1, 2})
        );

        OptionalInt any = users.stream().map(user -> Arrays.stream(user.getPhoneNumbers()))
                .flatMapToInt(phNumbers -> phNumbers.filter(phNumber -> phNumber == 1))
                .findAny();

        System.out.println(any);
    }

    static class User {
        private String name;
        private int age;
        private int[] phoneNumbers;

        public User(String name, int age, int[] phoneNumbers) {
            this.name = name;
            this.age = age;
            this.phoneNumbers = phoneNumbers;
        }

        public int[] getPhoneNumbers() {
            return phoneNumbers;
        }

        public void setPhoneNumbers(int[] phoneNumbers) {
            this.phoneNumbers = phoneNumbers;
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
