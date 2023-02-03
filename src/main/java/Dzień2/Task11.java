package Dzień2;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        String input = "kajak";
        System.out.println("Input: " + args[0]);
        System.out.println("Result: " + ifPalindrome(args[0]));

        input = "sda";
        System.out.println("Input: " + input);
        System.out.println("Result: " + isPalindrome(input));


    }
    private static boolean ifPalindrome(String inputString){
        StringBuilder sAfterReverse = new StringBuilder(inputString).reverse();
        String stringAfterReverse = sAfterReverse.toString();
        return stringAfterReverse.equals(inputString);

    }
    private static boolean isPalindrome(String input){
        if(StringValidator.isValid(input)){
            int forward = 0;
            int backward = input.length()-1;
            while (backward >forward){
                char forwardChar = input.charAt(forward);
                char backwardChar = input.charAt(backward);
                if (forwardChar != backwardChar) {
                    return false;
                }
                forward++;
                backward--;
            }
            return true;
        }
        return false;
    }
}
