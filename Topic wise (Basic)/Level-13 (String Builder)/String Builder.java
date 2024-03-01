class FirstClass {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("Chandan");

        System.out.println("Origenal Name : " + sb);

        //deleting
        sb.delete(0, 1);
        System.out.println("After deleting Char : " + sb);

        //inserting
        sb.insert(0, 'C');
        System.out.println("Inserting char : " + sb);

        //set char at
        sb.setCharAt(5, 'u');
        System.out.println("Changing the char : " + sb);

        //deleting
        sb.delete(6, 7);
        System.out.println("Final Name : " + sb);

        //Character
        System.out.println("The char at 0 index : " + sb.charAt(0));

        System.out.println("Thank you :)");
    }
}