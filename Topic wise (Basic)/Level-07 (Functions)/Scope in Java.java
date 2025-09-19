class FirstFunction {

    // Functional scope
    public static void myFunction() {
        int a = 21;
        int j = 11; // block scope ==> can't be access outside of this function

        System.out.println(a);
    }

    public static void main(String args[]) {
        System.out.println("Scope in Java:- \n");

        // ==> Block Scope - Only accessible within the block
        int p = 4;

        // System.out.println(v); // Error -> above the variable can't be possible to use
        int v = 12;
        
        for(int i = 1, j = 10; i <= 5; i++) {
            System.out.println(j);
        }

        {
            int k = 6;
            float m = 12; // block scope ==> can't be access outside of this block

            System.out.println(k);
        }

        System.out.println(p);
        // System.out.println(m); // Error -> Outside the block
    }
}