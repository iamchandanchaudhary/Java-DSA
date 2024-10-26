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

    // Insertion
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
        } else if(root.data == key) {
            return true;
        } else {
            return search(root.right, key);
        }
    }

    // Delete Node 
    public static Node delete(Node root, int val) {
        if(root.data > val) {
            root.left = delete(root.left, val);
        } 
        else if(root.data < val) {
            root.right = delete(root.right, val);
        }
        else { // root.data == val
            // case --> No Child
            if(root.left == null && root.right == null) {
                return null;
            }

            // case 2 --> One Child
            if(root.left == null) {
                return root.right;
            } else if(root.right == null) {
                return root.left;
            }

            // case 3 --> two child
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.notright = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node inorderSuccessor(Node root) {
        while(root.left != null) {
            root = root.left;
        }

        return root;
    }

    public static void main(String args[]) {
        System.out.println("BST Operations :- ");
        Scanner sc = new Scanner(System.in);

        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;

        for(int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        System.out.print("Inorder : ");
        inorder(root);
        System.out.println();

        // System.out.print("Search Value : ");
        // int key = sc.nextInt();

        // if(search(root, key)) {
        //     System.out.println("Present");
        // } else {
        //     System.out.println("Absent");
        // }

        System.out.print("Delete Value : ");
        int val = sc.nextInt();

        delete(root, val);

        System.out.print("New List : ");
        inorder(root);
    }
}