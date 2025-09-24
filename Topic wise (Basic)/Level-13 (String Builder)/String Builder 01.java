class FirstClass {
    public static void main(String[] args) {
        
        StringBuilder alphabet = new StringBuilder("");
        
        for(char ch = 'a'; ch <= 'z'; ch++) {
            alphabet.append(ch);
        }
        
        // ==> Time Complexity
        // String Builder => O(26)
        // String => O(26^2)
        
        System.out.println("\nAlphabet: " + alphabet);
        System.out.println("Length: " + alphabet.length());
        
    }
}
