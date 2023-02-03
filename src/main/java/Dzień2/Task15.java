package Dzień2;

public class Task15 {
    public static void main(String[] args) {
        String[] input = {null, "ma", "kota"};
        String[] input2 = {null, "ma", "kota"};
        System.out.println(isEqual(input,input2));
    }

    private static boolean isEqual(String[] tablica1, String[] tablica2){
        if (tablica1.length != tablica2.length){
            return false;
        }

        for( int i = 0; i < tablica1.length; i++){
            String tablica1Element = tablica1[i];
            String tablica2Element = tablica2[i];
            if(tablica1Element == null && tablica2Element == null){
                continue;
            }
            if( tablica1Element == null || (!tablica1Element.equals(tablica2Element))){
                return false;
            }

        }
        return true;

    }

}