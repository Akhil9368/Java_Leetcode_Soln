class Solution {
    public int missingNumber(int[] nums) {
        int x=0;
        for(int I: nums){
            x ^=I;
        }
        for(int i=1;i<nums.length+1;i++){
            x ^= i;
        }
        return x;
  
