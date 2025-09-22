class FirstString {

    public static String subString(String sentence, int start, int end) {

        String subSentence = "";

        for(int i = start; i < end; i++) {
            subSentence += sentence.charAt(i);
        }

        System.out.println("Sub Sentence: " + subSentence);

        return subSentence;
    }
    public static void main(String args[]) {
        System.out.println("Substring:- \n");

        String sentence = "Chandan Chaudhary";

        System.out.println("Your Sentence: " + sentence);
        
        subString(sentence, 2, 7);
        subString(sentence, 8, 17);
    }
}