package com.herbalife.labs.lab07;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

import static com.herbalife.labs.lab07.ValidationConstants.*;

public class Lab07 {
    public static void main(String[] args) {

        String username = "fgonzalez";
        String password = "fgOnzalez92";

        boolean usernameValid = isNotNull
                .and(isNotBlank)
                .and(isNotEmpty)
                .and(lengthValidator.apply(6,12))
                .test(username);

        boolean passwordValid = isNotNull
                .and(isNotBlank)
                .and(isNotEmpty)
                .and(lengthValidator.apply(8,14))
                .and(hasDigit)
                .and(hasUpperCase)
                .test(password);

        System.out.println(usernameValid);
        System.out.println(passwordValid);

//        Function<String,Boolean> isNotBlankNotNullOrEmpty = str -> str!=null&&!str.isBlank()&&!str.isEmpty();
//        BiFunction<String,Integer,Boolean> isLengthGreaterThan = (str, greaterThan) -> str.length() > greaterThan;
//        BiFunction<String,Integer,Boolean> isLengthLowerThan = (str, lowerThan) -> str.length() < lowerThan;
//
//        Function<String, Boolean> validate =  isNotBlankNotNullOrEmpty;
//
//        String username = "fgonzalez";
//
//        validate.andThen(x -> x.).apply(username)

    }
}