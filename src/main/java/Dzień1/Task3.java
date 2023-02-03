package Dzień1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.print("Please provide x");
        Integer x = getNumer();
        System.out.print("Please provide y");
        Integer y = getNumer();
        System.out.println(IsXgreaterThanY(x,y));
        System.out.println(Is3XgreaterThanY(x,y));
        System.out.println(IsYPostIsSmallerThanXPre(x,y));
    }
    public static Integer getNumer(){
        Scanner scanner = new Scanner(System.in);
        Integer number = scanner.nextInt();
        return number;
    }
    public static boolean IsXgreaterThanY(Integer x, Integer y) {
        if (x > y) {
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean Is3XgreaterThanY(Integer x, Integer y){
        if ( x*3 > y){
            return true;
        }
        else{
            return  false;
        }
    }
    public static boolean IsYPostIsSmallerThanXPre(Integer x, Integer y) {
        if (y++ < ++x && --x < y++) {
            return true;
        } else {
            return false;
        }
    }
}
