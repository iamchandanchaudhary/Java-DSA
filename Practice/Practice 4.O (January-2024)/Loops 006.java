class Loops {
    public static void main(String args[]) {

        String name = "Chandan Chaudhary";

        // for loop
        for(int i = 1; i <= 5; i++) {
            System.out.println(i + ". " + name);
        }

        // while loop
        int i = 1;
        while(i <= 5) {
            System.out.println(name);
            i++;
        }

        // do while loop
        int j = 1;
        do {
            System.out.println(name);
            j++;
        } while(j <= 5);
    }
}