class FirstClass {
    public static void main(String args[]) {
        System.out.println("Append Operation:- \n");

        StringBuilder sb = new StringBuilder("Chandan");

        System.out.println("Origenal Name : " + sb);
        sb.append(' ');
        sb.append('C');
        sb.append('h');
        sb.append('a');
        sb.append('u');
        sb.append('d');
        sb.append('h');
        sb.append('a');
        sb.append('r');
        sb.append('y');

        //System.out.println("Origenal name : Chandan");
        System.out.println("After append : " + sb);


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