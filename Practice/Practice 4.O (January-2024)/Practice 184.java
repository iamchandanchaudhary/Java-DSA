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

    // add - First
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

    // delete - first
    public void deleteFirst() {
        if(head == null) {
            return;
        }

        head = head.next;
    }

    // reverse list
    public void reverseList() {
        if(head == null || head.next == null) {
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            // updating
            currNode = nextNode;
            prevNode = currNode;
        }
        head.next = null;
        head = prevNode;

    }
    // print
    public void printList() {
        if(head == null) {
            System.out.println("This list is Empty!");
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

        LinkedLists list = new LinkedLists();
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(6);

        //list.deleteFirst();

        list.printList();

        list.reverseList();
        list.printList();
    }
}