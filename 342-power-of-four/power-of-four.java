class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1){
            return true;
        }
        
        if(n==0){
            n=1;
        }
        if(n%4==0){
            return isPowerOfFour(n/4);
        }else{
            return false;
        }
    }
}