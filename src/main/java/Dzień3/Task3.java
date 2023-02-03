package Dzień3;

import java.util.regex.Pattern;

public class Task3 {
    private static final String REGEX = "(-)?[\\d]+(,)?[\\d]+";
    // private static final String DIGIT_REGEX = "-?\\d+(,\\d+)?;

    public static void main(String[] args) {
        String test = "-123,9999";
        System.out.println(isCorrectFormat(test));


    }
    private static boolean isCorrectFormat (String x){
        Pattern pattern = Pattern.compile(REGEX);
        return pattern.matcher(x).matches();
    }
}