package Dzień2;

import static Dzień2.StringValidator.isValid;

public class Task1 {
    private static final char DEFAULT_CHAR = '\u0000';
    public static void main(String[] args) {
        String input = "ala";
        System.out.println("Original word: " + input);
        System.out.println("Last char: " + getLastCharacter(input));

        input = "domek";
        System.out.println("Original word: " + input);
        System.out.println("Last char: " + getLastCharacter(input));

        input = "";
        System.out.println("Original word: " + input);
        System.out.println("Last char: " + getLastCharacter(input));

        input = null;
        System.out.println("Original word: " + input);
        System.out.println("Last char: " + getLastCharacter(input));

        input = " ";
        System.out.println("Original word: " + input);
        System.out.println("Last char: " + getLastCharacter(input));
    }
    private static char  getLastCharacter(String input){
        // warunek1 && warunek2 -> całość jest true gdy warunek1 jest true i warunek2 jest true
        // warunek1 & warunek2 -> wykonaja się zawsze oba warunki
        if (isValid(input)) {
            int lastPosition = input.length() - 1;
            return input.charAt(lastPosition);
        }
        return DEFAULT_CHAR;
    }
}
