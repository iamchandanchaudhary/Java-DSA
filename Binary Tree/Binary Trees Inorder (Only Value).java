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

    // public static void preorder(Node root) {
    //     if(root == null) {
    //         System.out.print(-1 + " ");
    //         return;
    //     }

    //     System.out.print(root.data + " ");
    //     preorder(root.left);
    //     preorder(root.right);
    // }

    public static void inorder(Node root) {
        if(root == null) {
            //System.out.print(-1 + " ");
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String args[]) {
        System.out.println("Binary Tree :- \n");

        // Rule of Inorder tree -- Left Subtree --> Root --> Right Subtree

        BinaryTree tree = new BinaryTree();
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        Node root = tree.buildTree(nodes);

        //System.out.println(root.data);
        //System.out.print("Preorder Binary Tree : ");
        //preorder(root);

        System.out.print("Inorder Binary Tree : ");
        inorder(root);
    }
}