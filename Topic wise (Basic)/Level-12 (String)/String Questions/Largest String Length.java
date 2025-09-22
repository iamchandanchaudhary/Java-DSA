class FirstString {
    public static void main(String args[]) {
        System.out.println("Find Largest size of String:- \n");

        String str[] = {"ChanduBhaiii", "Chandan Chaudhary", "Ranger Boy", "Daku Daddy", "Aaa"};

        String largest = str[0];
        
        for(int i = 0; i < str.length; i++) {
            if(largest.length() < str[i].length()) {
                largest = str[i];
            }
        }

        System.out.println("Largest String: " + largest);
        
    }
}