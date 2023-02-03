package Dzień2;

public class Task7 {
    public static void main(String[] args) {
        String input = "Ala ma kota";
        int howManySpaces = getSpaces(input);
        System.out.println("Result: "+ (double)howManySpaces/input.length() * 100 + "%");

    }

    private static int getSpaces(String input) {
        int counter = 0;
        if (StringValidator.isValid(input)) {
            //   for( int i = input.indexOf(searchedChar); i < input.length(); i++) {
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == ' ') {
                    counter++;
                }
            }
        }
        return counter;
    }
}
