class Solution {
    String str1 [] ={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
     public List<String> letterCombinations(String digits){
         if(digits.length()==0){
             ArrayList<String> arr = new ArrayList();
             return arr;
         }
         return letterCombinations2(digits);
     }
   private List<String> letterCombinations2(String digits) {
       if(digits.length()==0){
           List<String> r = new ArrayList<>();
           r.add("");
           return r;
       }
        char str =digits.charAt(0);
        int digit = str-'0';
        String stre =str1[digit];
        String sub=digits.substring(1);
        List<String> list = new ArrayList<>();
        for(int i=0;i<stre.length();i++){
            List<String> ste= letterCombinations2(sub);
            for(String s:ste){
                list.add(stre.charAt(i)+s);
            }
        }
        return list;
    }
}
