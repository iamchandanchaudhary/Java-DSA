class BST {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // insert
    public static Node insert(Node root, int value) {
        if(root == null) {
            root = new Node(value);
            return root;
        }

        if(root.data > value) {
            root.left = insert(root.left, value);
        } 
        else {
            root.right = insert(root.right, value);
        }

        return root;
    }

    // Inorder
    public static void inorder(Node root) {
        if(root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // print in Range
    public static void printinRange(Node root, int X, int Y) {
        if(root == null) {
            return;
        }

        if(root.data >= X && root.data <= Y) {
            printinRange(root.left, X, Y);
            System.out.print(root.data + " ");
            printinRange(root.right, X, Y);
        } 
        else if(root.data >= X) {
            printinRange(root.left, X, Y);
        } 
            else {
                printinRange(root.right, X, Y);
        }
    }

    public static void main(String args[]) {
        System.out.println("BST Print in Range :- \n");

        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};

        Node root = null;

        for(int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        System.out.print("BST Order : ");
        inorder(root);
        System.out.println();

        // print in range
        System.out.print("Value in this Range : ");
        printinRange(root, 4, 10);
    }
}