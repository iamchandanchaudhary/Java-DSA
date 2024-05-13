import java.util.*;

class BinaryTrees {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;
        public static Node buildTree(int nodes[]) {
            idx++;
            if(nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    // Preorder
    public static void preorder(Node root) {
        if(root == null) {
            //System.out.print(-1 + " ");
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // inorder
    public static void inorder(Node root) {
        if(root == null) {
            // System.out.print(-1 + " ");
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Postorder
    public static void postorder(Node root) {
        if(root == null) {
            //System.out.print(-1 + " ");
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    // count Node
    public static int countNode(Node root) {
        if(root == null) {
            return 0;
        }

        int leftSubtree = countNode(root.left);
        int rightSubtree = countNode(root.right);

        return leftSubtree + rightSubtree + 1;

    }

    // Sum of Node
    public static int sumofNode(Node root) {
        if(root == null) {
            return 0;
        }

        int leftSubtree = sumofNode(root.left);
        int rightSubtree = sumofNode(root.right);

        return leftSubtree + rightSubtree + root.data;
    }

    // Height of Tree
    public static int height(Node root) {
        if(root == null) {
            return 0;
        }

        int leftSubtree = height(root.left);
        int rightSubtree = height(root.right);

        return Math.max(leftSubtree, rightSubtree) + 1;
    }

    // Diameter of tree
    public static int diameterofTree(Node root) {
        if(root == null) {
            return 0;
        }

        int leftSubtree = diameterofTree(root.left);
        int rightSubtree = diameterofTree(root.right);

        int diameterofTree = height(root.left) + height(root.right) + 1;

        return Math.max(diameterofTree, Math.max(leftSubtree, rightSubtree));
    }

    public static void main(String[] args) {
        System.out.println("Binary Tree :- \n");

        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        BinaryTree tree = new BinaryTree();

        Node root = tree.buildTree(nodes);

        System.out.println("Root of Tree : " + root.data);

        System.out.print("Preorder : ");
        preorder(root);

        System.out.print("\nInorder : ");
        inorder(root);

        System.out.print("\nPostorder : ");
        postorder(root);

        System.out.println("\n");
        System.out.println("Count Node : " + countNode(root));

        System.out.println("Sum of Node : " + sumofNode(root));

        System.out.println("Height of Node : " + height(root));

        System.out.println("Diameter of Tree : " + diameterofTree(root));
    }
}