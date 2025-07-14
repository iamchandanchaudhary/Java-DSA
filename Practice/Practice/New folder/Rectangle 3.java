import java.util.*;

class FirstClass {
    public static void main(String args[]) {
        int n = 5;
        int m = 6;

        //outer loop
        for( int i = n; i >= 1; i-- ) {
            for( int j = 1; j <= i; j++ ) {
                System.out.print("*");   
            } System.out.println();
        }

    }
}