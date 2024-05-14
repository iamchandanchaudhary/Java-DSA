class LL {
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

    // Print
    public void printList() {
        if(head == null) {
            System.out.println("List is Empty");
            //head = currNode;
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
        System.out.println("Add First (Link List) : \n");

        LL list = new LL();
        list.addFirst("Chandan");
        list.addFirst("a");

        list.printList();

        list.addFirst("is");
        list.printList();

        list.addFirst("This");
        list.printList();
    }
}