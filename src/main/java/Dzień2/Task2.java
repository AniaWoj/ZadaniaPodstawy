package Dzień2;

import static Dzień2.StringValidator.isValid;

public class Task2 {
    public static void main(String[] args) {
        String input = "programowanie";
        String prefix = "pro";
        String suffix = "nie";
        System.out.println("Input: " + input);
        System.out.println("Prefix: " + prefix);
        System.out.println("Result: " + isPrefix(input,prefix));
        System.out.println("Result: " + isSuffix(input,suffix));

        input = "programowanie";
        prefix = "abc";
        System.out.println("Input: " + input);
        System.out.println("Prefix: " + prefix);
        System.out.println("Result: " + isPrefix(input,prefix));

        input = "programowanie";
        prefix = null;
        System.out.println("Input: " + input);
        System.out.println("Prefix: " + prefix);
        System.out.println("Result: " + isPrefix(input,prefix));
    }
    private  static boolean isPrefix(String input, String prefix){
        if (isValid(input) && isValid(prefix)) { // StringValidator.isValid() a potem ustawić się na isValid i Alt + enter skróci nazwę Add
            return input.startsWith(prefix);
        }
        return false;
    }

    private  static boolean isSuffix(String input, String suffix){
        if (isValid(input) && isValid(suffix)) { // StringValidator.isValid() a potem ustawić się na isValid i Alt + enter skróci nazwę Add
            return input.endsWith(suffix);
        }
        return false;
    }

}
