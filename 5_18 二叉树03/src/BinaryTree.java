import java.util.*;

class Node {
    public int val;
    public Node left;
    public Node right;

    public Node(int val) {
        this.val = val;
    }
}
public class BinaryTree {

    // 进阶1：层序遍历
    void levelOrderTraversal(Node root){

        if(root == null) return;
        //root不为空，入队
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        //判断队列是否为空，队列不为空，弹出队头元素保存在cur，并打印队头元素，
        //然后将cur的左孩子和有孩子入队
        while(!queue.isEmpty()){
            Node cur = queue.poll();
            if(cur != null){
                System.out.print(cur.val + " ");
                if(cur.left != null){
                    queue.offer(cur.left);
                }
                if(cur.right != null){
                    queue.offer(cur.right);
                }
            }
        }
        System.out.println();
    }


    //层序遍历 --- 以list形式打印
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ret = new LinkedList<>();
        if(root == null) return ret;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            //1、求当前队列的大小  size
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            //2、while(size > 0)  -->控制当前每一层的数据个数

            while(size > 0){
                Node cur = queue.poll();
                if(cur != null){
                    list.add(cur.val);
                    if(cur.left != null){
                        queue.offer(cur.left);
                    }
                    if(cur.right != null){
                        queue.offer(cur.right);
                    }
                }
                size--;
            }
            ret.add(list);
        }
        return ret;
    }


    //进阶2：断树是否为完全二叉树
    boolean isCompleteTree(Node root){
        if(root == null) return true;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            Node cur = queue.poll();
            if(cur != null){
                queue.offer(cur.left);
                queue.offer(cur.right);
            }else{
                break;
            }
        }

        //break跳出来 -- 队列里面是否为空
        while(!queue.isEmpty()){
            Node cur2 = queue.peek();
            if(cur2 != null){
                return false;
            }else{
                queue.poll();
            }
        }

        return true;
    }




    //进阶3：非递归前序遍历
    void prevOrderTraversalNor(Node root){
        //栈实现---创建一个栈
        Stack<Node> stack = new Stack<>();
        if(root == null){
            return;
        }
        Node cur = root;
        while(cur != null || !stack.empty()){
            //一直往左走，cur为空结束
            while(cur != null){
                stack.push(cur);
                System.out.println(cur.val + " ");
                cur = cur.left;
            }

            //当cur为空时，找右边
            Node top = stack.pop();
            cur = top.right;
        }
        System.out.println();
    }



    //进阶4：非递归中序遍历
    // 中序遍历
    void inOrderTraversalNor(Node root){
        //栈实现 --- 创建栈
        Stack<Node> stack = new Stack<>();
        if(root == null){
            return;
        }
        Node cur = root;
        while(cur != null || !stack.empty()){
            //一直向左走
            while(cur != null){
                stack.push(cur);
                cur = cur.left;
            }
            //左为空，将栈顶元素弹出，再打印栈顶元素，栈顶元素就是没有左的根
            Node top = stack.pop();
            System.out.print(top.val + " ");
            //再找右
            cur = top.right;
        }
        System.out.println();
    }



    //进阶5：非递归后序遍历
    void postOrderTraversalNor(Node root){

        if(root == null) return;
        Stack<Node> stack = new Stack<>();
        Node cur = root;

        Node prev = null;

        while (cur != null || !stack.empty()) {

            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }

            cur = stack.peek();

            //分为两种情况 --- 右为空 ，右不为空
            //cur.right == prev --- 代表已经遍历过
            if (cur.right == null || cur.right == prev) {
                System.out.print(cur.val+" ");
                stack.pop();
                prev = cur;
                cur = null;
            } else {
                cur = cur.right;
            }
        }
        System.out.println();
    }

    //进阶5：构建一个二叉树
    int i = 0;
    public Node buildTree(String str){
        Node root = null;
        //先将字符串变成字符
        //两种情况 --- 为'#' -- 不是'#'
        if(str.charAt(i) != '#'){
            root = new Node(str.charAt(i));
            i++;
            root.left = buildTree(str);
            root.right = buildTree(str);
        }else{
            i++;
        }
        return root;
    }

    //找最近公共祖先
    public Node lowestCommonAncestor(Node root, Node p, Node q) {
        //三种情况
        //1、p和q分别在根的左边或者右边 --- 返回root
        //2、p和q在根的左边 --- 返回left
        //3、p和q在根的右边 --- 返回Right

        if(root == null){
            return null;
        }

        if(root == p || root == q){
            return root;
        }

        Node left = lowestCommonAncestor(root.left,p,q);
        Node right = lowestCommonAncestor(root.right,p,q);
        if(left != null && right != null){
            return root;
        }else if(left != null){
            return left;
        }else{
            return right;
        }
    }



}
