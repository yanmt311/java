public class Main {

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        Node root = binaryTree.buildTree();//创建树返回的是根节点

        //前序遍历
        binaryTree.preOrderTraversal(root);
        System.out.println();

        //中序遍历
        binaryTree.inOrderTraversal(root);
        System.out.println();

        //后序遍历
        binaryTree.postOrderTraversal(root);
        System.out.println();

        //遍历思路-求结点个数
        binaryTree.getSize1(root);
        System.out.println("节点的个数："+ BinaryTree.size);

        // 子问题思路-求结点个数
        System.out.println("节点的个数："+ binaryTree.getSize2(root));

        // 遍历思路-求叶子结点个数
        binaryTree.getLeafSize1(root);
        System.out.println("叶子节点的个数："+ BinaryTree.leafSize);

        // 子问题思路-求叶子结点个数
        System.out.println("叶子节点的个数："+ binaryTree.getLeafSize2(root));
    }
}
