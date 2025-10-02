class Wrapper {
    public static void main(String args[]) {
        System.out.println("Wrapper Class:- \n");

        int number = 1; // normal variable
        Integer number2 = 5; // Wrapped class(reference variable) --> Can be used as object
        Integer number3 = Integer.valueOf(number2); // Working is in behind the scene

        boolean condition1 = true;
        Boolean condition2 = false;

        Double d = 1.43;
        Float f = 1.43f;
        Character c = '@';
        Byte b = 8;
        Short s = 12;

        System.out.println(number3);
    }
}