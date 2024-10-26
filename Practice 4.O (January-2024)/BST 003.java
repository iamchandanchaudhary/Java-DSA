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
        } 
        else {
            root.right = insert(root.right, value);
        }

        return root;
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

    // Searching 
    public static boolean search(Node root, int key) {
        if(root == null) {
            return false;
        }

        if(root.data > key) {
            return search(root.left, key);
        } 
        else if(root.data == key) {
            return true;
        } 
        else {
            return search(root.right, key);
        }

        //return root;
    }

    // Delete
    public static Node delete(Node root, int val) {
        
        if(root.data > val) {
            return delete(root.left, val);
        } 
        else if(root.data < val) {
            return delete(root.right, val);
        }

        else { // when Equal
            // Case 1 --> no child
            if(root.left == null && root.right == null) {
                return null;
            } 

            // case 2 --> one child
            if(root.left == null) {
                return root.right;
            } else if(root.right == null) {
                return root.left;
            }

            // case 3 --> two child
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }

        return root;
    }

    public static Node inorderSuccessor(Node root) {
        while(root.left != null) {
            root = root.left;
        }
        return root;
    }

    // print in range
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

        Scanner sc = new Scanner(System.in);

        System.out.println("BST Operations :- \n");

        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};

        Node root = null;

        for(int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        System.out.print("BST : ");
        inorder(root);
        System.out.println();
        
        // System.out.print("Search Value : ");
        // int key = sc.nextInt();

        if(search(root, 4)) {
            System.out.println("Present");
        } 
        else {
            System.out.println("Absent");
        }

        delete(root, 11);
        System.out.print("New : ");
        inorder(root);
        System.out.println();

        System.out.print("Value in Range : ");
        printinRange(root, 4, 10);
    }
}