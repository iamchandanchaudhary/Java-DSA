class FirstStrings {
    public static void main(String args[]) {
        String name1 = "Chandan";
        String name2 = "Chandan1";

        System.out.println(name1.length());

        if(name1.compareTo(name2) == 0) {
            System.out.println("String are Equal");

        } else {
            System.out.println("String are not Equal");
        }
    }
}