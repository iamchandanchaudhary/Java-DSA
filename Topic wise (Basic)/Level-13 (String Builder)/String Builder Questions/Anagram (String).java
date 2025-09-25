import java.util.Arrays;

class AnagramChecker {
    public static boolean areAnagrams(String str1, String str2) {
        // Handle null or empty strings as needed
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }

        char[] charArray1 = str1.toLowerCase().toCharArray();
        char[] charArray2 = str2.toLowerCase().toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String s1 = "Listen";
        String s2 = "Silent";
        String s3 = "Hello";
        String s4 = "World";

        System.out.println(s1 + " and " + s2 + " are anagrams: " + areAnagrams(s1, s2)); // true
        System.out.println(s3 + " and " + s4 + " are anagrams: " + areAnagrams(s3, s4)); // false
    }
}