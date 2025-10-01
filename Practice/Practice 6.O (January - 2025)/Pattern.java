import java.util.*;

class Pattern {
    public static void main(String[] args) {
        
        System.out.println("Pattern Program:- \n");

        int n = 5;
        int num = 1;

        for(int i = 1; i <= n; i++) {
            for(int j = n; j >= i; j--) {
                System.out.print(num+1 + " ");
            }
            System.out.println("");
        }
    }
}