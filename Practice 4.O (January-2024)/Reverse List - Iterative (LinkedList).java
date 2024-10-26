class LinkedLists {

    Node head;
    
    class Node {
        int data;
        Node next = null;

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

    // delete - first
    public void deleteFirst() {
        if(head == null) {
            System.out.println("This list is empty");
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

            // update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    // public void reverseIterate() {
    //     if(head == null || head.next == null) {
    //         return;
    //     }

    //     Node prevNode = head;
    //     Node currNode = head.next;
    //     while(currNode != null) {
    //         Node nextNode = currNode.next;
    //         currNode.next = prevNode;

    //         // update
    //         prevNode = currNode;
    //         currNode = nextNode;
    //     }
    //     head.next = null;
    //     head = prevNode;
    // }
    // public void reverseIterate() {
    //     if(head == null || head.next == null) {
    //         return;
    //     }

    //     Node prevNode = head;
    //     Node currNode = head.next;
    //     while(currNode != null) {
    //         Node nextNode = currNode.next;
    //         currNode.next = prevNode;

    //         // update
    //         prevNode = currNode;
    //         currNode = nextNode;
    //     }
    //     head.next = null;
    //     head = prevNode;
    // }
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
        System.out.println("NULL");
    }

    public static void main(String args[]) {
        System.out.println("Reverse List (LinkedList) :- \n");

        LinkedLists list = new LinkedLists();

        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);

        System.out.print("List (Add first) : ");
        list.printList();

        System.out.print("List (Add last) : ");
        list.addLast(6);
        list.printList();

        // list.deleteFirst();
        // list.printList();

        System.out.print("Reverse List : ");
        list.reverseIterate();
        list.printList();
    }
}