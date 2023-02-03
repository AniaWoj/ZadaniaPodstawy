package Dzień1;

public class Task6 {
    public static void main(String[] args) {
        printMultiplicationTable();
        printMultiplicationTable(6,2,5);


    }
    private static void printMultiplicationTable() {
        for (int i = 1; i <= 4; i++) {
            System.out.println(("5 x " + i + "=" + (5 * i)));
        }
    }

    private static void printMultiplicationTable(int multipler, int multiplicandMin, int multiplicandMax){

        for (int i = multiplicandMin; i <= multiplicandMax; i++){
            int result = multipler * i;
            System.out.println(multipler + "x" + i + "=" + result);
        }

    }
}
