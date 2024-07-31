import java.util.*;

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
        } else {
            root.right = insert(root.right, value);
        }

        return root;
    }

    // Searching 
    public static boolean search(Node root, int key) {
        if(root == null) {
            return false;
        }

        if(root.data > key) { // Left Subtree
            return search(root.left, key);
        } else if(root.data == key) {
            return true;
        } else { // right Subtree
            return search(root.right, key);
        }
    }

    // inorder
    public static void inorder(Node root) {
        if(root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String args[]) {
        System.out.println("BST Search :- \n");

        Scanner sc = new Scanner(System.in);

        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};

        Node root = null;

        for(int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        System.out.print("BST(Inorder) : ");
        inorder(root);
        System.out.println();

        System.out.print("Search Number : ");        
        int key = sc.nextInt();

        if(search(root, key)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}