class LinkedList {

    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // add - first
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // add - last
    public void addLast(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            //System.out.println("This list was empty!");
            return;
        }
        Node currNode = head;
        while(currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // delete - first
    public void deleteFirst() {
        if(head == null) {
            System.out.println("List was empty!");
            return;
        }
        head = head.next;
    }

    // print
    public void printList() {
        if(head == null) {
            System.out.println("List was empty!");
            return;
        }

        Node currNode = head;
        while(currNode != null) {
            System.out.print(currNode.data + " -> ");

            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    public static void main(String args[]) {
        System.out.println("LinkedList : \n");

        System.out.println("Add first (LinkedList) :- ");

        LinkedList list = new LinkedList();
        list.addFirst("University");
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");

        list.printList();

        System.out.println("\nAdd last (LinkedLisk) : ");
        list.addLast("Okk");

        list.printList();

        System.out.println("\nDelete First (LinkedList) :- ");
        list.deleteFirst();
        list.printList();

    }
}