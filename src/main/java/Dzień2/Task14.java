package Dzień2;

import java.util.Arrays;

public class Task14 {
    public static void main(String[] args) {
        int[] inputs = {12, -7, 19, -5};
        int size = countMinusValues(inputs);
        int[] getMinusValuesArray = getMinusValuesArray(inputs,size);
        System.out.println(Arrays.toString(getMinusValuesArray));

    }

    private static int[] getMinusValuesArray(int[] inputs, int size) {
        int[] results = new int[size];
        int i = 0;
        for (int element : inputs) {
            if (element < 0) {
                results[i] = element;
                i++;
            }
        }
        return results;
    }

    private static int countMinusValues(int[] inputs) {
        int count = 0;
        for (int element : inputs) {
            if (element < 0) {
                count++;
            }
        }
        return count;

    }
}