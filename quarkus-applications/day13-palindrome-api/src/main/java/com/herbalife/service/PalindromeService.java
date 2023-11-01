package com.herbalife.service;

import com.herbalife.model.Palindrome;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class PalindromeService {
    @Inject
    Palindrome palindrome;

    public boolean IsPalindrome(String word){
        return palindrome.IsPalindrome(word);
    }
}
