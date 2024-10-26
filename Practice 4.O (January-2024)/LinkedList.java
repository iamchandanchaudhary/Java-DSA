class LinkLists {
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
        // add - first & last

        public void addFirst(String data) {
            Node newNode = new newNode(data);
            if(head == null) {
                newNode = head;
                return;
            }

            newNode.next = head;
            head = newNode;
        }
    }
    public static void main(String args[]) {
        
        LinkLists list = new LinkLists();
        list.addFirst("a");
        list.addFirst("is");

    }
}