import java.util.*;

class FirstClass {

    public static int countVowel(String str) {
        int countVowel = 0;

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                countVowel++;
            }
        }

        System.out.println("Total Vowel: " + countVowel);

        return countVowel;
    }

    public static void main(String[] args) {
        System.out.println("Count Total no. of  Vowel:- \n");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any String: ");
        String str = sc.nextLine();

        countVowel(str);
    }
}
