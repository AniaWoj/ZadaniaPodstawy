package Dzień3;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task4 {
    private static final String A_PSIK_REGEX = "a+( ){1}psik";
    private static final String A_PSIK_REGEX1 = "a+ psik";
    private static final String A_PSIK_REGEX2 = "a+ (psik|Psik)";

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();
        System.out.println(shouldISayBlessYou(inputText));
    }
    private static boolean shouldISayBlessYou(String text){
        Pattern pattern = Pattern.compile(A_PSIK_REGEX);
        return pattern.matcher(text).matches();
    }
}
