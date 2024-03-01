class FirstStrings {
    public static void main(String args[]) {

        String name1 = "Chandan";
        String name2 = "Chandan";

        // s1 > s2 : +ve
        // s1 == s2 : 0
        // s1 < s2 : -ve
        
        if(name1.compareTo(name2) == 0) {
            System.out.println("String are Equal");
        } else {
            System.out.println("String are not Equal");
        }
    }
}