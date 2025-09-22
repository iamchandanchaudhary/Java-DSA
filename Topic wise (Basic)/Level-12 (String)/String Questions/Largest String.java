class FirstString {
    public static void main(String args[]) {
        System.out.println("Largest String(on the basis of Laxicographic):- \n");

        String str[] = {"ChanduBhaiii", "Chandan Chaudhary", "Ranger Boy", "Daku Daddy", "Aaa"};

        String largest = str[0];

        // s1 > s2 : +ve
        // s1 == s2 : 0
        // s1 < s2 : -ve
        
        for(int i = 0; i < str.length; i++) {
            if(largest.compareTo(str[i]) < 0) {
                largest = str[i];
            }
        }

        System.out.println("Largest String: " + largest);
        
    }
}