class FirstString {
    public static void main(String args[]) {
        System.out.println("Substring:- \n");

        String sentence = "My name is Chandan Chaudhary";
        String name = sentence.substring(11, 18);
        // ending index is not included
        
        System.out.println("Full Sentence: " + sentence);
        System.out.println("Name: " + name);
    }
}