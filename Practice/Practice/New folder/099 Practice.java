class FirstStrings {
    public static void main(String args[]) {

        String FirstName = "Chandan";
        String LastName = "Chaudhary";

        //String FullName = FirstName + " " + LastName;

        // System.out.print("No. of Charecter : ");
        // System.out.println(FullName.length());

        // System.out.println("Full length Name : ");
        // for(int i = 0; i < FullName.length(); i++) {
        //     System.out.println(FullName.charAt(i));
        // }

        if(FullName.compareTo(LastName) == 0) {
            System.out.println("String are Equal");
        } else {
            System.out.println("String are not Equal");
        }
    }
}