class FirstString {
    public static boolean isPalindrome(String word) {

        int length = word.length();
        System.out.println("\nYour Word: " + word);

        for(int i = 0; i < length/2; i++) {
            if(word.charAt(i) != word.charAt(length-i-1)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("Check is String a Palindrome?:- ");

        String word1 = "noon";
        String word2 = "morning";
        String word3 = "racecar";
        String word4 = "madam";
        String word5 = "nandan";

        System.out.println("is Palindrome?: " + isPalindrome(word1));
        System.out.println("is Palindrome?: " + isPalindrome(word2));
        System.out.println("is Palindrome?: " + isPalindrome(word3));
        System.out.println("is Palindrome?: " + isPalindrome(word4));
        System.out.println("is Palindrome?: " + isPalindrome(word5));
    }
}
