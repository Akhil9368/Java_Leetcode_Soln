import java.awt.image.AreaAveragingScaleFilter;
import java.util.Collection;
import java.util.HashSet;

public class palindromic_substring {
    public static void main(String[] args) {
        String str="nitin";
        String temp;
        int k=0;
        int z=0;
        HashSet<String>set = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                  temp=str.substring(i,j);
                  if(palindrom(temp)) {
                    set.add(temp);
                 }
            }
        }
        System.out.println(set);
        int arr[] = new int[set.size()];
        for (String str3: set) {
            arr[k++] = str3.length();
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max= arr[i];
                z=i;
            }
        }
        for (String s : set)
              {if(s.length() == max){
                      System.out.println(s);
                  }
              }
    }

    private static boolean palindrom(String substring) {
     int  i=0;
     int j=substring.length()-1;
     while(i<=j){
         if(substring.charAt(i)!=substring.charAt(j)){
             return false;
         }i++;
         j--;
     }
     return true;
    }
}

