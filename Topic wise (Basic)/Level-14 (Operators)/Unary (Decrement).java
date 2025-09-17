class Unary {
    public static void main(String args[]) {

        System.out.println("Pre Decrement : ");

        int a = 10;

        // pre decrement
        int b = --a; // 1st Change Value & 2nd Use Value
        System.out.println("A is : " + a); // 9
        System.out.println("B is : " + b); // 9

        System.out.println("Post Decrement : ");

        int i = 20;

        // post decrement
        int j = i--; // 1st Use Value & 2nd Change Value
        System.out.println("I is : " + i); // 19
        System.out.println("J is : " + j); // 20
    }
}