class FirstClass {
    public static void main(String args[]) {

        System.out.println("With post increment : ");
        int a = 10;
        int b = 5;

        //Post increment
        b = a++;
        System.out.println("A is " + a);
        System.out.println("B is " + b);

        System.out.println("With pre increment : ");
        int i = 20;
        int j = 15;

        //pre increment
        j = ++i;
        System.out.println("I is " + i);
        System.out.println("J is " +j);
    }
}