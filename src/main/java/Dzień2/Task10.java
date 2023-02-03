package Dzień2;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many words would you like insert?");
        int howManyWords = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Result: " + getLastCharsFromWords(howManyWords));

    }
    private static String getLastCharsFromWords (int howManyWords){
        StringBuilder result = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        while (howManyWords-- > 0) {
            String word = scanner.nextLine();
            result.append((word.charAt(word.length()-1)));
        }
        return result.toString();
    }
}
