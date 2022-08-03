class Solution {
    public int[] productExceptSelf(int[] nums) {
     int right[] = new int [nums.length];
        int lproduct =1;
        int left[] = new int[nums.length];
        int rproduct=1;
        for(int i=0;i<nums.length;i++){
            left[i]=lproduct*nums[i];
            lproduct = lproduct * nums[i];
            
        }
        for(int i=nums.length-1;i>=0;i--){
            right[i] = rproduct *nums[i];
            rproduct=rproduct*nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(i==0){
                nums[i] = right[i+1];
            }
            else if(i ==nums.length-1 ){
                nums[i]= left[i-1];
            }
            else
             nums[i] = left[i-1]*right[i+1];
          }
        return nums;
    }
    
}
