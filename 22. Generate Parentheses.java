class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> str = new ArrayList<>();
        int currentopen =0;
        int currentclose= 0;
        
        genereate(n,currentopen,currentclose,str,"");
        return str;
        
    }
    public void  genereate(int n , int currentopen, int currentclose,List<String> str,String bracket)    {
        if(bracket.length() == 2*n){
            str.add(bracket);
            return;
        }
        
      if(currentopen<n){
        genereate(n,currentopen+1,currentclose,str,bracket+"(");
      }
      if(currentclose<currentopen){
            genereate(n,currentopen,currentclose+1,str,bracket+")");
    } 
    }
}
