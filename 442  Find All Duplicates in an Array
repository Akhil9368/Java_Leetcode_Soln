class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        int n = arr.length;
        List <Integer> list = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            int index=Math.abs(arr[i])-1;
            if(arr[index] > 0){
               
             arr[index]=-arr[index];
            }
    
             else
                  list.add(Math.abs(arr[i]));
        }
        return list;
    }
}
