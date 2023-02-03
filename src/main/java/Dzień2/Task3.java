package Dzień2;

public class Task3 {
    public static void main(String[] args) {
        String input = "Ala ma kota";
        String word = "ma";
        System.out.println("Input: " + input);
        System.out.println("Word: " + word);
        System.out.println("Result: " + getIndex(input,word));

        input = "Ala ma kota";
        word = null;
        System.out.println("Input: " + input);
        System.out.println("Word: " + word);
        System.out.println("Result: " + getIndex(input,word));
    }
    private static int getIndex(String input, String word){
        if(StringValidator.isValid(input) && StringValidator.isValid(word)){
//            if(input.contains(word)){
//                return input.indexOf(word);
//            }else{
//                return -1;
//            }
            // warunek? operacja1: operacja2
            // warunek ? operacja1_gdy_warunek_true: operacja2_gdy_warunek_false
            // return input.contains(word) ? input.indexOf(word) : -1;
            return input.indexOf(word);
        }
        return -1;
    }
}
