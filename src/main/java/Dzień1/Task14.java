package Dzień1;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide an amount");
        Double amount = scanner.nextDouble();
        System.out.println("Please provide a number of installments");
        Integer numberOfInstallments = scanner.nextInt();

        if (numberOfInstallments < 6 || numberOfInstallments > 48 ){
            numberOfInstallments = 36;
        }
        if (amount < 100.00 || amount > 10000.00){
            amount = 5000.00;
        }
        if (numberOfInstallments >= 6 && numberOfInstallments <= 12) {
            if (amount >= 100.00 && amount <= 10000.00) {
                System.out.println((amount + amount * 0.025) / numberOfInstallments);
            } else {
                System.out.println((amount + amount * 0.025) / numberOfInstallments);
            }
        } else if (numberOfInstallments >= 13 && numberOfInstallments <= 24) {
            if (amount >= 100.00 && amount <= 10000.00) {
                System.out.println((amount + amount * 0.05) / numberOfInstallments);
            } else {
                System.out.println((5000.00 + 5000.00 * 0.05) / numberOfInstallments);
            }
        } else if (numberOfInstallments >= 25 && numberOfInstallments <= 48) {
            if (amount >= 100.00 && amount <= 10000.00) {
                System.out.println((amount + amount * 0.10) / numberOfInstallments);
            } else {
                System.out.println((5000.00 + 5000.00 * 0.10) / numberOfInstallments);
            }
        }
    }
}
