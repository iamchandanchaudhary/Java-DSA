class LinkLists {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
    // add First
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // add last
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
        System.out.println("Adding first & last :- \n");

        LinkLists list = new LinkLists();
        list.addFirst("Anchal");
        list.addFirst("love");
        list.addFirst("Chandan");

        list.printList();

        list.addLast(":)");

        list.printList();
    }
}