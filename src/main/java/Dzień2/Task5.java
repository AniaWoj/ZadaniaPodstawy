package Dzień2;

public class Task5 {
    public static void main(String[] args) {
        String input = "Ala ma kota";
        char searchedChar = 'a';
        System.out.println("Result: " + countCharInString(input, searchedChar));

        input = null;
        searchedChar = 'a';
        System.out.println("Result: " + countCharInString(input, searchedChar));
    }
    private static int countCharInString(String input, char searchedChar ){
        int counter = 0;
        if (StringValidator.isValid(input)){
            //   for( int i = input.indexOf(searchedChar); i < input.length(); i++) {
            for( int i = 0; i < input.length(); i++) {
                if(input.charAt(i) == searchedChar){
                    counter++;
                }
            }
        }
        return counter;
    }
}
