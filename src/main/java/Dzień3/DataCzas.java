package Dzień3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DataCzas {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        LocalTime localTime1 = localTime.plusHours(5);
        System.out.println(localTime1);

        LocalTime localTime2 = LocalTime.of(12,55,3);
        System.out.println(localTime2);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate localDate1 = LocalDate.of(2001,5,17);
        System.out.println(localDate1);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.of(2010,7,5,14,56,25);
        System.out.println(localDateTime1);

//        LocalDate localDate = LocalDate.now();
//        String format = localDate.format(DateTimeFormatter.BASIC_ISO_DATE); //
//        System.out.println(format);
    }
}
