
class Node{
    public char val;
    public Node left;
    public Node right;

    public Node(char val) {
        this.val = val;
    }
}
public class BinaryTree {

    // 子问题思路-求第 k 层结点个数
    int getKLevelSize(Node root,int k){
        if(root == null){
            return 0;
        }
        if(k == 1){
            return 1;
        }
        return getKLevelSize(root.left,k-1) + getKLevelSize(root.right,k-1);
    }

    // 获取二叉树的高度
    int getHeight(Node root) {
        if(root == null) {
            return 0;
        }
//        else{
//            return Math.max(getHeight(root.left), getHeight(root.right))+1;
//        }

        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.left);
        return leftHeight>rightHeight ? leftHeight + 1 : rightHeight+1;
    }


    // 查找 val 所在结点，没有找到返回 null
    // 按照 根 -> 左子树 -> 右子树的顺序进行查找
    // 一旦找到，立即返回，不需要继续在其他位置查找
    Node find(Node root, char val){
        if(root == null) {
            return null;
        }

        //1、判断根节点是否是查找的数字val
        if(root.val == val) {
            return root;
        }
        //2、左边
        //  递归--》左边全部递归完成后-》返回值是否是空
        Node leftVal = find(root.left,val);
        if( leftVal!= null){
            return leftVal;
        }

        //3、右边
        Node rightVal = find(root.right,val);
        if(rightVal != null){
            return rightVal;
        }
        return null;
    }


    //相同的数
    public boolean isSameTree(Node p,Node q) {
        if(p == null && q == null){
            return true;
        }
        if((p ==null && p != null) || (q == null && q != null)){
            return false;
        }
        if(p.val == q.val){
            if(isSameTree(p.left ,q.left) && isSameTree(p.right,q.right)){
                return true;
            }
        }
        return false;
    }


    //判断子树
    public boolean isSubtree(Node s, Node t) {
        if(s == null || t == null) {
            return false;
        }
        //判断t树是否和s树相同
        if(isSameTree(s,t)){
            return true;
        }

        //判断t树是不是s的左子树
        if(isSubtree(s.left,t)){
            return true;
        }

        //判断t树是不是s的右子树
        if(isSubtree(s.right,t)){
            return true;
        }
        return false;
    }


    //判断树是否平衡

    class Solution {
        public boolean isBalanced(Node root) {
            //根节点的左右两树的高度差是否是<=1
            //递归 - 左树是不是平衡
            //递归 - 右树是不是平衡
            if(root == null){
                return false;
            }
            int leftHeight = maxDepth(root.left);
            int rightHeight = maxDepth(root.right);
            return Math.abs(leftHeight-rightHeight) < 2 && isBalanced(root.left) && isBalanced(root.right);

        }
        public int maxDepth(Node root) {
            if(root == null) {
                return 0;
            }
            int leftHeight = maxDepth(root.left);
            int rightHeight = maxDepth(root.right);

            return leftHeight >  rightHeight? leftHeight+1 :
                    rightHeight+1;
        }
    }

    //镜像对称二叉树
    public boolean isSymmetric(Node root) {
        if(root == null){
            return true;
        }
        return isSymmetricChild(root.left,root.right);
    }

    public boolean isSymmetricChild(Node leftTree,Node rightTree){
        if((leftTree != null && rightTree == null) || (leftTree == null && rightTree != null)){
            return false;
        }
        if(leftTree == null && rightTree == null){
            return true;
        }

        return  (leftTree.val == rightTree.val)
                &&isSymmetricChild(leftTree.left,rightTree.right)
                &&isSymmetricChild(leftTree.right,rightTree.left);

    }


}
