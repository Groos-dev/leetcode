class Solution {
  List<Integer> ans = null;
  public List<Integer> inorderTraversal(TreeNode root) {
    ans = new ArrayList<>();
    dfs(root);
    return ans;
  }
  private void dfs(TreeNode root) {
    if (root == null) {
      return;
    }
    dfs(root.left);
    ans.add(root.val);
    dfs(root.right);
  }
}
