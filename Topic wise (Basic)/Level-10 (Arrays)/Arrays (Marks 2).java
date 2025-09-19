class FirstArray {
    public static void main(String args[]) {

        int[] marks = new int[3];
        marks[0] = 93; // physics
        marks[1] = 90; // chemistry
        marks[2] = 89; // english

        for(int i = 0; i < marks.length; i++) {
            System.out.println("Marks at Index " + i + " : " + marks[i]);
        }
    }
}