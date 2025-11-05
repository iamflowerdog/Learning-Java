/**
 * 二叉树（Binary Tree）基础学习 - 入门版
 * 从最简单的开始：树的创建、插入和遍历
 */
public class TreeDemo {

    // 树节点类
    static class TreeNode {
        int value;          // 节点的值
        TreeNode left;      // 左子节点
        TreeNode right;     // 右子节点

        TreeNode(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    // 二叉搜索树类
    static class BinarySearchTree {
        TreeNode root;  // 根节点

        BinarySearchTree() {
            this.root = null;
        }

        // 插入节点（二叉搜索树规则：左小右大）
        public void insert(int value) {
            root = insertRec(root, value);
        }

        private TreeNode insertRec(TreeNode node, int value) {
            // 如果当前位置为空，创建新节点
            if (node == null) {
                return new TreeNode(value);
            }

            // 比当前节点小，放左边
            if (value < node.value) {
                node.left = insertRec(node.left, value);
            } 
            // 比当前节点大，放右边
            else if (value > node.value) {
                node.right = insertRec(node.right, value);
            }

            return node;
        }

        // 中序遍历（左 -> 根 -> 右）
        // 二叉搜索树的中序遍历结果是从小到大排序的
        public void inOrder(TreeNode node) {
            if (node != null) {
                inOrder(node.left);         // 先遍历左子树
                System.out.print(node.value + " ");  // 再访问根节点
                inOrder(node.right);        // 最后遍历右子树
            }
        }

        // 查找节点
        public boolean search(int value) {
            return searchRec(root, value);
        }

        private boolean searchRec(TreeNode node, int value) {
            // 节点为空，没找到
            if (node == null) {
                return false;
            }
            // 找到了
            if (node.value == value) {
                return true;
            }
            // 比当前节点小，去左边找
            if (value < node.value) {
                return searchRec(node.left, value);
            } 
            // 比当前节点大，去右边找
            else {
                return searchRec(node.right, value);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("=== 二叉搜索树入门 ===\n");

        // 创建一棵空树
        BinarySearchTree tree = new BinarySearchTree();

        // 第1步：插入节点
        System.out.println("第1步：插入节点");
        System.out.println("插入顺序: 50, 30, 70, 20, 40");
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);

        // 第2步：遍历树（中序遍历会得到有序结果）
        System.out.println("\n第2步：中序遍历树");
        System.out.print("结果: ");
        tree.inOrder(tree.root);
        System.out.println(" <- 自动排序！");

        // 第3步：查找节点
        System.out.println("\n第3步：查找节点");
        System.out.println("查找 30: " + (tree.search(30) ? "✓ 找到了" : "✗ 没找到"));
        System.out.println("查找 100: " + (tree.search(100) ? "✓ 找到了" : "✗ 没找到"));

        // 树的结构图解
        System.out.println("\n=== 树的结构 ===");
        System.out.println("      50       <- 根节点");
        System.out.println("     /  \\");
        System.out.println("    30   70");
        System.out.println("   / \\");
        System.out.println("  20  40");
        
        System.out.println("\n关键规则：");
        System.out.println("✓ 左边的值 < 根节点的值 < 右边的值");
        System.out.println("✓ 中序遍历 = 从小到大排序");
    }   
}
