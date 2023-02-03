package Dzień1;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas provide a number");
        int number = scanner.nextInt();
        System.out.println("Sum Of Digits: " + sumOfDigits(number));

    }

    public static int sumOfDigits(int number) {
        int sum = 0;

        if (number > 9) {
            while (number != 0) {
                sum += (number % 10);
                number = number/10;
            }
        } else {
            sum = number;
        }
        return sum;
    }

}
