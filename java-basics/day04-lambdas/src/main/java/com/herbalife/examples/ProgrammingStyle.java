package com.herbalife.examples;

import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate;

public class ProgrammingStyle {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Clojure", "Java", "Erlang", "Golang", "Javascript");

        for (int i = 0; i < languages.size(); i++) {
            String language = languages.get(i);
            if(language.startsWith("J"))
            {
                System.out.println(language);
            }
        }
        
        languages
                .stream().parallel()
                .filter(lang -> lang.startsWith("J"))
                .forEach(System.out::println);
    }

    class PredicateImpl implements Predicate<String>{

        public boolean test(String s) {
            return false;
        }
    }
}
