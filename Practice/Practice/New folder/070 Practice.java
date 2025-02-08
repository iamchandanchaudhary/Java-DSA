import java.util.*;

class FirstFunction {
    public static boolean isEligible(int age) {
        if(age > 18){
            return Eligible;
        } else {
            return Not;
            }
    }
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in); 
            int age = sc.nextInt();

            int n = isEligible(age);
            System.out.println(n);
        }
    }
