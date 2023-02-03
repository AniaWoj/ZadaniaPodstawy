package org.example;


public class App
{
    public static void main( String[] args )
    {
        String s1 = "SDA";
        String s2 = "SDA";
        String s3 = new String ("SDA");
        String s4 = String.valueOf("SDA");

        System.out.println( s1 ==s2 );
        System.out.println( s1.equals(s2) );
        System.out.println( s1 ==s3 );
        System.out.println( s1.equals(s3) );
        System.out.println( s1 ==s4 );
        System.out.println( s1.equals(s4) );
    }
}
