package Dzień1;

public class Task5 {
    public static void main(String[] args) {
        int firstDigit = 4;
        int secondDigit = 11;
        int result = sum(firstDigit, secondDigit);
        System.out.println("Result: " + result);

    }
    private static int sum(int firstDigit, int secondDigit) {
        if (firstDigit > secondDigit) {
            int tmp = secondDigit;
            secondDigit = firstDigit;
            firstDigit = tmp;
        }

        int sum = 0;
        // #1

//        for(int i=firstDigit; i <= secondDigit; i++){
//           //for(;firstDigit <= secondDigit; firstDigit++){
//            sum += i;
//        }
//        return sum,}
        //#2
//        while (firstDigit <= secondDigit){
//            sum =+ firstDigit;
//            firstDigit++;
        do {
            sum += firstDigit;
            firstDigit++;
        } while(firstDigit <= secondDigit);
        return sum;
    }

}
