

/*
Pattern: Tree DFS
01 Binary Tree Level Order Traversal (easy)

Given a binary tree and a number ‘S’,
find if the tree has a path from root-to-leaf such that the sum of all the node values of that path equals ‘S’.

# LeetCode 112. Path Sum [Easy]
[Result]
Runtime: 0 ms, faster than 100.00% of Java online submissions for Path Sum.
Memory Usage: 37.4 MB, less than 98.84% of Java online submissions for Path Sum.
*/


class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode(int value){
    val = value;
  }
};

class TreePathSum {
  public static boolean hasPath(TreeNode root, int sum) {

    if(root == null) return false;
    if(root.val == sum && root.left == null && root.right == null) return true;

    return hasPath(root.left, sum - root.val) || hasPath(root.right, sum - root.val);
  }/*
  Time Complexity: O(N)
  Space Complexity: O(N)
  */

  public static void main(String[] args) {
    TreeNode root = new TreeNode(12);
    root.left = new TreeNode(7);
    root.right = new TreeNode(1);
    root.left.left = new TreeNode(9);
    root.right.left = new TreeNode(10);
    root.right.right = new TreeNode(5);
    System.out.println("Tree has path: " + TreePathSum.hasPath(root, 23));
    System.out.println("Tree has path: " + TreePathSum.hasPath(root, 16));
  }
}
