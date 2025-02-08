class FirstStrings {
    public static void main(String args[]) {
        String name1 = "Chandan";
        String name2 = "Chaudhary";

        String fullName = name1 + " " + name2;
        System.out.println(fullName);

        System.out.println(fullName.length());

        for(int i = 0; i < fullName.length(); i++) {
        System.out.println(fullName.charAt(i));
        }

        //compair
        if(name1.compareTo(name2) == 0) {
            System.out.println("String are Equal");
        } else {
            System.out.println("String are not Equal");
        }
    }
}