class Operators {
    public static void main(String[] args) {
        
        System.out.println("Relational Operators:- \n");

        int a = 14;
        int b = 10;
        int c = 10;

        System.out.println("Is Equal?: " + (a == c));
        System.out.println("Is Greaterthen?: " + (a > b));
        System.out.println("Is Lessthen?: " + (a < b));
        System.out.println("Is Greaterthen Equalto?: " + (a >= b));
        System.out.println("Is Lessthen Equalto?: " + (b <= c));
        System.out.println("Is Not Equalsto?: " + ( a != b));


        // Examples
        System.out.println("\nExamples:-");
        if(a == c) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }


        if(a > b) {
            System.out.println("A is Greater");
        } else {
            System.out.println("B is Greater");
        }


        if(a < b) {
            System.out.println("B is Greater");
        } else {
            System.out.println("A is Greater");
        }

        
    }
}
