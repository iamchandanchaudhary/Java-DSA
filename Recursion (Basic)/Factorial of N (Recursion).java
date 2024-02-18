class Recursion {
    public static void printFactorial(int i, int n, int facto) {
        if(i == 5) {
            facto *= i;
            System.out.println("Factorial of N : " + facto);
            return;
        }
        //facto = n(n-1);
        facto *= i;
        printFactorial(i+1, n, facto);
    }
    public static void main(String args[]) {
        System.out.println("Find factorial of N (Recursion) :- \n");
        
        printFactorial(1, 5, 1);
        System.out.println("Thank You :)");
    }
}