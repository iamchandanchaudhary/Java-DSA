class FirstStrings {
    public static void main(String args[]) {

        String name = "Chandan";
        String surname = "Chaudhary";

        String FullName = name + " " + surname;

        System.out.println("Your full Name : " + FullName);
        System.out.println("Name length : " + FullName.length());

        System.out.println("Name charecter vertically : ");

        for(int i = 0; i < FullName.length(); i++) {
        System.out.println(FullName.charAt(i));
        }
    }
}