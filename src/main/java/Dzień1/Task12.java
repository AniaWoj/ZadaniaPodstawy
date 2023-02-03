package Dzień1;

public class Task12 {
    public static void main(String[] args) {
        int a = 4;
        int b = 3;
       // int c = a/b;
        int result = ownModuloImplementation(a,b);
        System.out.println("Result of "+ a + "%" + b + "="+ result);
        System.out.println(ifOwnModuloImplementationIsCorrect(a,b));
    }
    private static int ownModuloImplementation(int a, int b){
//        int result = 0;
//        if ( a/b * b == a ){
//            result = 0;
//        }else{
//            resoult = a - (b *a/b);
//        }
//        return result;
        return a - (a/b) *b;
    }
    private static boolean ifOwnModuloImplementationIsCorrect(int a, int b){
        return ownModuloImplementation(a,b) == (a % b);
    }

}
