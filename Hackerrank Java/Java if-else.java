import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int N = scanner.nextInt();
        int c;
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        //Test Case
        c = N % 2;
        if ( c == 1 ){
            System.out.println("Weird");
        }
        else {
            if( N >= 2 && N <= 5 ){
                System.out.println( "Not Weird" );
            } else if( N >= 6 && N <= 20 ) {
                System.out.println( "Weird" );
            } else {
                System.out.println( "Not Weird" );
            }
        }
    }
}