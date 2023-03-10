package Dzień3;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        /*
        LocalDate.now();
        LocalDate.of(2023,01,28);
        LocalDate.parse("2023-01-28"); -> parsuje ze stringa na localDateTima
        LocalDate.parse("28-01-2023", DateTimeFormatter.ofPattern("dd-MM-yyyy")); -> inny format więc potrzeba formatera

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert date in format[MM/dd/yyyy HH.mm.ss]");
        String inputDate = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH.mm.ss");
        //LocalDateTime parse = LocalDateTime.parse("01/28/2022 13.05.28", formatter);
        // System.out.println(parse);
        LocalDateTime nextLesson = LocalDateTime.parse(inputDate, formatter);

        LocalDateTime now = LocalDateTime.now();
        Duration duration = Duration.between(now, nextLesson);
        long days = duration.toDays();
        System.out.println("You have " + duration + " days to the next lesson");

        long daysPart = duration.toDaysPart();
        int hours = duration.toHoursPart();
        int minutes = duration.toMinutesPart();
        int sec = duration.toSecondsPart();
        System.out.println(daysPart + " days," + hours + " hours, " + minutes + " minutes, " + sec + " sec.");



    }
}
