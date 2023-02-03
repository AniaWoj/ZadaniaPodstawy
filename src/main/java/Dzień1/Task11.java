package Dzień1;

import java.util.Random;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        int random = new Random().nextInt(101);
        // int
        Scanner scanner = new Scanner(System.in);
        System.out.println(random);
        boolean isEqual = false;

        do {
            System.out.println("Pleas provide a number");
            int number = scanner.nextInt();
            if (random == number) {
                isEqual = true;
                System.out.println("Bingo!");
            } else if (random < number) {
                System.out.println("too much");
            } else {
                System.out.println("not enough");
            }
        } while (!isEqual);
    }
}
