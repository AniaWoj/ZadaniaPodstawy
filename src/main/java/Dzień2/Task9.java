package Dzień2;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        String longestInput = "";
        int lengthOfTheLongestWord = 0;
        do{
            System.out.println("Please provide text");
            System.out.println("If you want to stop please write Enough");

            input = scanner.nextLine();

            if (input.isBlank()){
                System.out.println("No input");
            }else if (!"Enough".equals(input)){
                if(input.length() > longestInput.length()){
                    longestInput = input;
                    lengthOfTheLongestWord = input.length();
                }
            }

        }while(!"Enough".equals(input));
        System.out.println(longestInput);
    }
}
