import java.util.HashSet;

class Hashing {
    public static void main(String args[]) {

        System.out.println("HashSet Operations :- \n");

        HashSet<Integer> set = new HashSet<>();

        // insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);

        // print all the elements
        System.out.println("Set : " + set);

        // Search - Contains
        if(set.contains(1)) {
            System.out.println("Set contains 1");
        }
        if(!set.contains(6)) {
            System.out.println("Dosen't coontains!");
        }

        // Delete
        set.remove(1);

        if(!set.contains(1)) {
            System.out.println("Doesn't Contains 1 - We deleted it");
        }
    }
}