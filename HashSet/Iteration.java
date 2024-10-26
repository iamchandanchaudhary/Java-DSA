import java.util.HashSet;
import java.util.Iterator;

class Hashing {
    public static void main(String args[]) {

        System.out.println("HashSet Operation :- \n");

        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(9);
        set.add(3);
        set.add(4);
        set.add(1);
        set.add(5);

        System.out.println("Set : " + set);

        //Iteration - HashSet does not have an order
        Iterator it = set.iterator();

        System.out.print("All Set Elements : ");
        while(it.hasNext()) {
            System.out.print(it.next() +" ");
        }
    }
}