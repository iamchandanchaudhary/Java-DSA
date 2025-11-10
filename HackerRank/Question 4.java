import java.util.Scanner;

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int i = sc.nextInt();
        double d = sc.nextDouble();
        sc.nextLine();
        String name = sc.nextLine();
        
        sc.close();

        System.out.println("String: " + name);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
