package com.cbfacademy;

public class StringExercises {

    public String fromCharacters(char[] characters) {
        // TODO - Write code that creates a String from the input array of characters
       
       return new String(characters);
    }

    public Long howMany(String text, Character character) {
        // TODO - Write code to determine how many of the input ${character} are contained in the input ${text}
        long count = 0;
       for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == character) {
                count++;
            }
       }
       return count;
    }

    public Boolean isPalindrome(String word) {
        // TODO - Write code to determine whether the input ${word} is a palindrome
        
        // String reversedWord = "";

        // for(int i = word.length(); i >=0; i--) {
        //     reversedWord += word.charAt(i);
        // }

        StringBuilder reversedWord = new StringBuilder(word);

        reversedWord.reverse();
        return word.equals(reversedWord.toString());
    }

    public String getName() {
        return "String Exercises";
    }
}
