class Recursion2 {
    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if(n == 1) {
            System.out.println("Transfer disk " + n + " form " + src + " to " + dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("Transfer disk " + n + " form " + src + " to " + dest);

        //towerOfHanoi(1, dest, helper, src);
        towerOfHanoi(n-1, helper, src, dest);
    }
    public static void main(String args[]) {
        System.out.println("Tower of Hanoi(Recursion) :- \n");
        
        int n = 3;
        System.out.println("For " + n + " disk : ");

        towerOfHanoi(n, "S", "H", "D");
    }
}