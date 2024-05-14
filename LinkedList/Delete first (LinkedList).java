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
        // Add First
        public void addFirst(String data) {
            Node newNode = new Node(data);
            if(head == null) {
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }
        // delete first
        public void deleteFirst() {
            if(head == null) {
                System.out.println("List is Empty!");
                return;
            }
            head = head.next;
        }

        // print
        public void printList() {
            if(head == null) {
                System.out.println("List is Empty");
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
        System.out.println("Deleting fist :- \n");

        LinkLists list = new LinkLists();
        list.addFirst("Beautiful");
        list.addFirst("is");
        list.addFirst("This");

        System.out.print("Normal list : ");
        list.printList();

        list.deleteFirst();

        System.out.print("\nAfter Deleting : ");
        list.printList();

        System.out.println("\nThank you :)");
    }
}