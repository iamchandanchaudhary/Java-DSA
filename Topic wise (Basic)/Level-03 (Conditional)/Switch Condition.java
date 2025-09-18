import java.util.*;

class FirstClass {
    public static void main(String args[]) {
        System.out.println("Switch Condition:- \n");
     
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch(button) {
            case 1 : System.out.println("Hello");
            break;
            case 2 : System.out.println("Namaste");
            break;
            case 3 : System.out.println("Bonjour");
            break;
            default : System.out.println("Invalid");
        }
    }
}