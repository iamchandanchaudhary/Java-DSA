class FirstClass {
    public static void main(String args[]) {

        System.out.println("Pre Decrement : ");

        int a = 10;
        int b = 5;

        b = --a;
        //pre decrement
        System.out.println("A is : " + a);
        System.out.println("B is : " + b);

        System.out.println("Post Decrement : ");

        int i = 20;
        int j = 15;

        j = i--;
        //post decrement
        System.out.println("I is : " + i);
        System.out.println("J is : " + j);
    }
}