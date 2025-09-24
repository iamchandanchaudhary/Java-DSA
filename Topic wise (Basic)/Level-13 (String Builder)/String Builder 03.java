class FirstClass {
    public static void main(String args[]) {
        System.out.println("String Builder(Basic Operations) :- \n");

        StringBuilder name = new StringBuilder("Chandan");

        // Origenal Name 
        System.out.println("Origenal Name : " + name);

        // find char at position
        char char_Index = name.charAt(3);
        System.out.println("CharAt Index(3) : " + char_Index);

        // set another character at position
        name.setCharAt(0, 'M');
        System.out.println("Set Another : " + name);

        // delete character
        name.delete(0, 1);
        System.out.println("After delete : " + name);

        // insert character at position
        name.insert(0, 'C');
        System.out.println("Insert Something : " + name);

        // add character
        name.append(" Chaudhary");
        System.out.println("New Name : " + name);

        // string length
        System.out.println("Length of String : " + name.length());

        System.out.print("Reverse of Your Name : ");
        for(int i = 16; i >= 0; i--) {
            System.out.print(name.charAt(i));
        }
        System.out.println();
    }
}