import java.util.HashSet;

class Hashing {
    public static void main(String args[]) {

        System.out.println("HashSet Operations :- \n");

        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);

        System.out.println("Set : " + set);
        System.out.println("Size of Set : " + set.size());
    }
}