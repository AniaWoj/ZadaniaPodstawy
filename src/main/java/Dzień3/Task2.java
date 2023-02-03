package Dzień3;

import java.util.regex.Pattern;

public class Task2 {
    //"PL12345678901234567890123456"
    //rivate static final String PL_IBAN_REGEX = "[P]{1}[L]{1}[0-9]{26}";
   // private static final String PL_IBAN_REGEX = "PL[0-9]{26}";
    private static final String PL_IBAN_REGEX = "PL[\\d]{26}";
    /*
    A-Za-z -> \W
    0-9 -> \d
     */

    public static void main(String[] args) {
        String iban = "PL12345678901234567890123456";
        System.out.println(isCorrectIbanFormat(iban));

    }
    private static boolean isCorrectIbanFormat(String iban){
        Pattern pattern = Pattern.compile(PL_IBAN_REGEX);
        return pattern.matcher(iban).matches();
    }
}
