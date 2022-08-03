class Solution {
    public int findMaxLength(int[] nums) {
        int count =0;
        int sum=0;
        HashMap<Integer,Integer> hmap = new HashMap<>();
        hmap.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                count++;
            }
            if(nums[i]==0){
               count--;
          }
             
            if(hmap.containsKey(count)){
                  sum = Math.max(sum,i-hmap.get(count));
            }
            else{
                hmap.put(count,i);
            }
        }
        return sum;
        }
    }
