package Dzień2;

import java.util.Locale;

import static Dzień2.StringValidator.isValid;

public class Task4 {
    private static final String REPLACEMENT = "-STOP-";

    public static void main(String[] args) {
        String input = "Ala ma, kota. kot, ma Ale";
        System.out.println(replaceString(input));

        input = null;
        System.out.println(replaceString(input));
    }
    private static String replaceString(String input){
        if(isValid(input)) {
//            input = input
//                    .replace(".", REPLACEMENT)
//                    .replace(",", REPLACEMENT);
            return input.replaceAll("[.,]",REPLACEMENT);
        }
        return input;
    }
}
