package Dzień1;

import java.util.ArrayList;
import java.util.Scanner;

public class Task7 {
    public static void main (String[] args) {
        // Input layer
        float a = getNumber();
        float b = getNumber();
        String operator = getOperator();

        // Logic layer
        float result = calculate(a, b, operator);
        String message = getCalculationMessage(a, b, result, operator);

        // Output layer
        System.out.println(message);

    }
    public static float getNumber(){
        System.out.println("Please input an integer!");
        Scanner scanner = new Scanner(System.in);
        float number = scanner.nextFloat();
        return number;
    }

    public static String getOperator(){
        System.out.println("Please provide your operation [+ - * /]");
        Scanner scanner = new Scanner(System.in);
        String operator = scanner.nextLine();
        return operator;
    }

    public static float addition(float a, float b){
        float result = a + b;
        return result;
    }

    public static float subtraction(float a, float b){
        float result = a - b;
        return result;
    }

    public static float multiplitcation(float a, float b){
        float result = a * b;
        return result;
    }

    public static float division(float a, float b) {

        float result = a / b;
        return result;


    }

    public static float calculate(float a, float b, String operator){
        float result = switch(operator) {
            case "+" -> addition(a, b);
            case "-" -> subtraction(a, b);
            case "*" -> multiplitcation(a, b);
            case "/" -> division(a, b);
            default -> 0;

        };
        return result;
    }

    public static String getCalculationMessage (float a, float b, float result, String operator){
        ArrayList<String> acceptableOperators = new ArrayList<>();
        acceptableOperators.add("+");
        acceptableOperators.add("-");
        acceptableOperators.add("*");
        acceptableOperators.add("/");

        String message;
        if (acceptableOperators.contains(operator)){
            if (operator == "/" && b == 0){
                message = "Wrong operation";
            }else {
                message = a + " " + operator + " " + b + " " + "=" + " " + result;
            }
        }
        else{
            message = "Operator not exist!";
        }
        return message;
    }
}

