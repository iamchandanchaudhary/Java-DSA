class LinkedLists {
    Node head;
    private int size;

    LinkedLists() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
        this.data = data;
        this.next = null;
        size++;
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
        size--;
        head = head.next;
    }

    // delete - last
    public void deleteLast() {
        if(head == null) {
            System.out.println("The list is empty!");
            return;
        }
        size--;
        if(head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;

        while(lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;

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
        System.out.println("Null");
    }

    // size of List
    public int getSize() {
        return size;
    }

    public static void main(String args[]) {
        System.out.println("LinkedList :- \n");

        LinkedLists list = new LinkedLists();

        System.out.print("Normal List (Add first) : ");
        list.addFirst("Beautiful");
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");

        list.printList();

        System.out.print("Normal List (Add last) : ");
        list.addLast("Place");

        list.printList();

        System.out.print("Delete First : ");
        list.deleteFirst();
        list.printList();

        System.out.print("Delete Last : ");
        list.deleteLast();
        list.printList();

        System.out.println("Size of List : " + list.getSize());

        list.addFirst("This");
        list.addLast("Place");

        System.out.println("List : ");
        list.printList();
        
        int size = list.getSize();
        System.out.println("\nSize of List : " + size);
    }
}