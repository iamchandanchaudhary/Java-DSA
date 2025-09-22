class FirstString {
    public static void main(String args[]) {
        System.out.println("Comparision of String:- \n");

        String name1 = "Chandan";
        String name2 = "Chandan";

        String name3 = new String("Chandan");

        // Method 1
        System.out.println("Method 1:");
        if(name1 == name2) {
            System.out.println("Strings are Equal.");
        } else {
            System.out.println("Strings are not Equal.");
        }

        if(name1 == name3) {
            System.out.println("Strings are Equal.");
        } else {
            System.out.println("Strings are not Equal.");
        }
        
        // Method 2

        // s1 > s2 : +ve
        // s1 == s2 : 0
        // s1 < s2 : -ve

        System.out.println("\nMethod 2:");
        if(name1.compareTo(name2) == 0) {
            System.out.println("Strings are Equal.");
        } else {
            System.out.println("Strings are not Equal.");
        }

        if(name1.compareTo(name3) == 0) {
            System.out.println("Strings are Equal.");
        } else {
            System.out.println("Strings are not Equal.");
        }

        // Method 3
        System.out.println("\nMethod 3:");
        if(name1.equals(name2)) {
            System.out.println("Strings are Equal.");
        } else {
            System.out.println("Strings are not Equal.");
        }

        if(name1.equals(name3)) {
            System.out.println("Strings are Equal.");
        } else {
            System.out.println("Strings are not Equal.");
        }
    }
}