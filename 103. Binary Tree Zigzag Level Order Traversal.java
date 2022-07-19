class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null ){
            return new ArrayList<>();
        }
        Queue<TreeNode> que = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        que.add(root);
      int i=0;
        while(!que.isEmpty()){
           
            List<Integer> arr =new ArrayList<>();
            int size=que.size();
            while(size !=0){
            TreeNode node = que.poll();
               arr.add(node.val);
               if(node.left != null){que.add(node.left);}
                if(node.right != null){que.add(node.right);}
                size--;
            }
          
            if(i%2 != 0){
            Collections.reverse(arr);
                i++;}
            else{i++;}
            list.add(arr);
         }
        return list;
    }
}
