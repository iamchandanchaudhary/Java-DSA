import java.util.LinkedList;

class LinkedLists {
    public static void main(String args[]) {
        System.out.println("Palindrome or Not :- \n");

        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);

        LinkedList<Integer> orignal = new LinkedList<Integer>();
        LinkedList<Integer> reverse = new LinkedList<Integer>();
        //int orignal[], reverse[];

        //System.out.println("List : " + list);
        // Orignal Series
        System.out.print("Orignal Series : ");
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
            orignal = list.get(i);
        }
        System.out.println();

        // Reverse Series
        System.out.print("Reverse Series : ");
        for(int i = 3; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
            reverse = list.get(i);
        }
        System.out.println();

        if(orignal == reverse) {
            System.out.println("They are Equal");
        } else {
            System.out.println("They are not Equal");
        }
    }
}