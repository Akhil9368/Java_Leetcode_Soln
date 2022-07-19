class Solution {
    public boolean checkTree(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<>();
        int data =0;
        que.add(root);
        while(!que.isEmpty()){
            TreeNode node= que.poll();
            data = node.val;
            if(node.left != null){
                data =data-node.left.val;
            }
            if(node.right !=null){
                data= data-node.right.val;
            }
        }
        if(data == 0){
            return true;
        }
        return false;
    }
}
