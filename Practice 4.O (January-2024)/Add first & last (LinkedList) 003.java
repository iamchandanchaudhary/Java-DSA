class LinkedLists {
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

    // add Last
    public void addLast(String data) {
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

    // delete first
    public void deleteFirst() {
        if(head == null) {
            return;
        }
        head = head.next;
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
        System.out.println("LinkedList(Practice) :- \n");

        LinkedLists list = new LinkedLists();
        list.addFirst("World");
        list.addFirst("beautiful");
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");

        list.addLast("Earth");
        //list.deleteFirst();

        list.printList();
        //System.out.println("List : " + list);
    }
}