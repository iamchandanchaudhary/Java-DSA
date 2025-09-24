class FirstClass {

    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == ' ' && i < str.length()-1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
        
    }

    public static void main(String[] args) {
        System.out.println("Convert the First Latter into Capital:- \n");

        String sentence = "hii, i'm chandan chaudhary.";

        String word = "chandan BHAIII";

        System.out.println("Nomal Case: " + sentence);
        System.out.println("Capitalize Case: " + toUpperCase(sentence));

        System.out.println("Capitalize Case: " + toUpperCase(word));
    }
}
