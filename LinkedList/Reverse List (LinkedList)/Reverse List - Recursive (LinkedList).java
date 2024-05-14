class LinkedList {

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

        newNode.next =head;
        head = newNode;
    }

    // add - last
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

    // reverse - recursive
    public Node reverseRecursive(Node head) {
        if(head == null || head.next == null) {
            return head;
        }

        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }
    // print
    public void printList() {
        if(head == null) {
            System.out.println("This list is empty");
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
        System.out.println("Reverse - Recursive (LinkedList) :- \n");

        LinkedList list = new LinkedList();

        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);

        System.out.print("Add First : ");
        list.printList();

        list.addLast(6);

        System.out.print("Add Last : ");
        list.printList();

        System.out.print("Reverse : ");
        list.head = list.reverseRecursive(list.head);
        list.printList();
    }
}