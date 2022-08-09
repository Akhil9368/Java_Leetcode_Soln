class Solution {
    public void rotate(int[] arr, int k) {
        k = k % arr.length;
        if((arr.length != 1) && k < arr.length)
        {
        reverse(arr, 0, arr.length - 1 - k);
        
        reverse(arr, arr.length - k, arr.length - 1);
        
            reverse(arr, 0, arr.length - 1);}
        
    }
    public int[] reverse(int[] arr, int start, int end) {
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}
