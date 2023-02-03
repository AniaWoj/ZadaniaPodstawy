package Dzień3;

import javax.xml.datatype.DatatypeConstants;
import java.time.LocalTime;
import java.util.Scanner;
import java.time.Duration;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("To start timing press ENTER");
        scanner.nextLine();
        LocalTime startTime = LocalTime.now();
        System.out.println(startTime);

        System.out.println("To stop timing pres ENTER");
        scanner.nextLine();
        LocalTime stopTime = LocalTime.now();
        System.out.println(stopTime);

        Duration duration = Duration.between(startTime, stopTime);
        System.out.println("Total time: " + duration.getSeconds() + " sec");




        System.out.println("Total time: ");
    }
}
