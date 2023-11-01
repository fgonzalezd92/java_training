package com.herbalife.model;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Palindrome {
    public boolean IsPalindrome(String word){
        return word.equalsIgnoreCase(new StringBuilder(word).reverse().toString());
    }
}
