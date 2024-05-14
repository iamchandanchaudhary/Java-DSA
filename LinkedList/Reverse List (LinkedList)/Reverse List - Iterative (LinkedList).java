class LinkedLists {

    Node head;
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    // add - first
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // add - Last
    public void addLast(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // delete - first;
    public void deleteFirst() {
        if(head == null) {
            System.out.println("This list is empty!");
            return;
        }
        head = head.next;
    }

    // reverse List
    public void reverseIterate() {
        if(head == null || head.next == null) {
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            // updation
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
        
    }
    // print
    public void printList() {
        if(head == null) {
            System.out.println("This list is empty!");
            return;
        }

        Node currNode = head;
        while(currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }
    public static void main(String args[]) {
        System.out.println("Reverse a List (LinkedList):- \n");

        LinkedLists list = new LinkedLists();
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);

        System.out.print("Orignal List : ");
        list.printList();

        System.out.print("Last (Add last): ");
        list.addLast(5);
        list.printList();

        // list.deleteFirst();
        // list.printList();

        System.out.print("After Reverse : ");
        list.reverseIterate();
        list.printList();
    }
}