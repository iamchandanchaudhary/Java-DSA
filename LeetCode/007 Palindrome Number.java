class Solution {

    public boolean isPalindrome(int x) {
        // Special cases:
        // As discussed, negative numbers are not palindromes.
        // Also, if the last digit of the number is 0, it can't be a palindrome unless the number is 0 itself.
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversed = 0;
        int original = x;

        while (original > reversed) {
            int digit = original % 10;
            reversed = reversed * 10 + digit;
            original /= 10;
        }

        // When the length is an odd number, we can get rid of the middle digit by reversed / 10
        // For example when the input is 12321, at the end of the while loop we get x = 12, reversed = 123,
        // since the middle digit doesn't matter in palidrome(it will always equal to itself), we can simply get rid of it.
        return original == reversed || original == reversed / 10;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        int x1 = 121;
        System.out.println("Example 1 Output: " + solution.isPalindrome(x1));

        int x2 = -121;
        System.out.println("Example 2 Output: " + solution.isPalindrome(x2));

        int x3 = 10;
        System.out.println("Example 3 Output: " + solution.isPalindrome(x3));

        int x4 = -101;
        System.out.println("Example 4 Output: " + solution.isPalindrome(x4));
    }
}