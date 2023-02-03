package Dzień1;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number =1;
        int sum = 0;
        int countNumbers = -1;
        int countEven = -1;
        float arithmeticAverage;
         do {
            countNumbers++;
            System.out.println("Please provide a number");
            number = scanner.nextInt();
            if (number % 2 == 0){
                countEven++;
            }
            sum += number;
        }while (number != 0);

        System.out.println("Total Number Of Digits: " + countNumbers);
        System.out.println("Total Number Of Even Digits: " + countEven);
        arithmeticAverage = (float)sum/countNumbers;
        System.out.println("Arithmetic Average: " + arithmeticAverage);

    }
}
