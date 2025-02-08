import java.util.*;

class Strings {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your Name : ");
        String name = sc.nextLine();

        for(int i = 1; i <= 5; i++) {

            if(name == "aa") {
                System.out.println("Name : " + name);
                break;
            }

        }
    }
}