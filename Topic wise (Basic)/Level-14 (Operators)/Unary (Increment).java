class Operators {
    public static void main(String args[]) {

        System.out.println("Post increment : ");

        int a = 10;

        // Post increment
        int b = a++;  // 1st Use Value & 2nd Change Value
        System.out.println("A is " + a); // 11
        System.out.println("B is " + b); // 10

        System.out.println("Pre increment : ");
        int i = 20;

        // pre increment
        int j = ++i; // 1st Change Value & 2nd Use Value
        System.out.println("I is " + i); // 21
        System.out.println("J is " + j); // 21
    }
}