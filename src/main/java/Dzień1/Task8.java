package Dzień1;

public class Task8 {
    public static void main(String[] args) {
        int rangeFrom = 0;
        int rangeTo = 10;

    }
    private static boolean isPrimeNumber(int number){
        if (number < 2){
            return false;
        }
        for (int i =2; i < number; i++){
            if (number%i == 0){
                return false;
            }
        }
        return true;

    }
}
