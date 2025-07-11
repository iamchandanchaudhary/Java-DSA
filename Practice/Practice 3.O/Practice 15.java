class FirstClass {
    public static void main(String args[]) {

        int age = 17;
        int *ptr = &age;
        int _age = *ptr;

        System.out.println("Pointer is : " + _age);
    }
}