import java.util.*;

class BinaryTrees {

    static class Nodea {
        int data;
        Nodea left;
        Nodea right;

        Nodea(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Root of Tree
    static class BinaryTree {
        static int idx = -1;
        public static Nodea buildTree(int nodes[]) {
            idx++;
            if(nodes[idx] == -1) {
                return null;
            }

            Nodea newNode = new Nodea(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    // preoder
    public static void preorder(Nodea root) {
        if(root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Count Node
    public static int countNode(Nodea root) {
        if(root == null) {
            return 0;
        }

        //System.out.print(root.data + " ");
        int countLeft = countNode(root.left);
        int countRight = countNode(root.right);

        return countLeft + countRight + 1;
    }

    // Sum of Tree
    public static int sumofTree(Nodea root) {
        if(root == null) {
            return 0;
        }

        int leftSum = sumofTree(root.left);
        int rightSum = sumofTree(root.right);

        return leftSum + rightSum + root.data;
    }

    // Height of Tree
    public static int height(Nodea root) {
        if(root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    // diameter of Tree
    public static int diameterofTree(Nodea root) {
        if(root == null) {
            return 0;
        }

        int leftDim = diameterofTree(root.left);
        int rightDim = diameterofTree(root.right);

        int diameter = height(root.left) + height(root.right) + 1;

        return Math.max(diameter, Math.max(leftDim, rightDim));
    }

    public static void main(String args[]) {
        System.out.println("Binary Tree :- \n");

        BinaryTree tree = new BinaryTree();
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        Nodea root = tree.buildTree(nodes);

        System.out.println("Root of Tree : " + root.data);

        System.out.print("Preorder Tree : " );
        preorder(root);
        System.out.println();

        System.out.println("Total Node : " + countNode(root));

        System.out.println("Height of Tree : " + height(root));

        System.out.println("Diameter of Tree : " + diameterofTree(root));

        System.out.println("Sum of Tree : " + sumofTree(root));
    }
}