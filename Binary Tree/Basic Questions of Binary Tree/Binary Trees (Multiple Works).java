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

    // order of tree
    public static void preorder(Node root) {
        if(root == null) {
            //System.out.print(-1 + " ");
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Count Node
    public static int countNode(Node root) {
        if(root == null) {
            return 0;
        }

        int leftSubtree = countNode(root.left);
        int rightSubtree = countNode(root.right);
        
        return leftSubtree + rightSubtree + 1;
    }

    // Sum of Nodes
    public static int sumOfNode(Node root) {
        if(root == null) {
            return 0;
        }

        int leftSum = sumOfNode(root.left);
        int rightSum = sumOfNode(root.right);

        return leftSum + rightSum + root.data;
    }

    // Height of Tree
    public static int height(Node root) {
        if(root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int heightofTree = Math.max(leftHeight, rightHeight) + 1;

        return heightofTree;
    }

    public static void main(String args[]) {
        System.out.println("Basic Questions of Binary Tree :- \n");

        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        //System.out.println(root.data);
        System.out.print("Preorder : ");
        preorder(root);
        System.out.println();

        System.out.println("Total Nodes : " + countNode(root));
        System.out.println("Sum of Nodes : " + sumOfNode(root));
        System.out.println("Height of Tree : " + height(root));

        System.out.println("\nThank You :)");
    }
}