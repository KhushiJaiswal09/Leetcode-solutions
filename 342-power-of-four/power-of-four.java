class Solution {
    public boolean isPowerOfFour(int n) {
        
        int i=0;
        boolean ans= true;
          if(n<=0){
                return false;
            }
        while(n>1){
            
            if(n%4!=0){
                ans= false;
                break;
            }else{
                n=n/4;
            }
            if(n==1){
                ans=true;
                break;
            }
            i=i+1;
        }
        
            return ans;
    }
}