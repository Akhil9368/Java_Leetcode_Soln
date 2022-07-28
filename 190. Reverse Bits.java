//In simple words >>> always shifts a zero into the leftmost position whereas >> shifts based on sign of the number i.e. 
//1 for negative number and 0 for positive number.
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result= 0;
        for(int i = 0; i < 32; i++){
            result<<=1;
            result += n%2;
            n>>>= 1;
        }
        return result;
    }
}
