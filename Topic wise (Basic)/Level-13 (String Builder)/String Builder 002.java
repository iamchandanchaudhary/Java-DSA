class FirstClass {
    public static void main(String args[]) {
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
    }
}