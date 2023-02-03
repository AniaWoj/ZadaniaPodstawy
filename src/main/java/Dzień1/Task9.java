package Dzień1;

public class Task9 {
    public static void main(String[] args) {

        int count = 1;
        while (count <= 100) {
            if (count % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (count % 3 == 0) {
                System.out.println("Fizz");
            } else if (count % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(count);
            }
            count++;
        }
    }
}