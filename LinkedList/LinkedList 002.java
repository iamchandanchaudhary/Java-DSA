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

    // Add - First
        public void addFirst(String data) {
            Node newNode = new Node(data);
            if(head == null) {
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        } 

    // Add - last
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

    // Print
        public void printList() {
            if(head == null) {
                System.out.println("List is Empty! ");
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
        System.out.println("Link List :- \n");

        LinkLists list = new LinkLists();
        list.addFirst("a");
        list.addFirst("is");

        list.printList();

        list.addLast("List");
        list.printList();

        list.addFirst("This");
        list.printList();
    }
}