class FirstString {
    public static void main(String args[]) {

        //concatenation
        String firstName = "Chandan";
        String lastName = "Chaudhary";

        String fullName = firstName + " " + lastName;

        System.out.println("Length of Name: " + fullName.length());
        System.out.println(fullName);

        for(int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }
    }
}