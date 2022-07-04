class Solution {
    public void sortColors(int[] arr) {
        int start =0;
        int end = arr.length-1;
        int mid =0;
      while(mid<=end){
          if(arr[mid]==1){
              mid++;
          }
          else if(arr[mid]==0){
              int temp=arr[mid];
              arr[mid]=arr[start];
              arr[start]=temp;
              mid++;start++;
          }
          else
          {
              int temp = arr[end];
              arr[end]= arr[mid];
              arr[mid]=temp;
              end--;
          }
      }
    }
}
